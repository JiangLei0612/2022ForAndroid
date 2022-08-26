package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActivityAboutRetrofit extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_retrofit);
    }
    @Override
    protected void test() {
        super.test();
//        //动态代理
//        UserService businessService = new UserServiceImpl();
//        UserService userService = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), businessService.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Log.e("tag","proxy = "+proxy.getClass().getSimpleName()+" method = "+method.getName()+" args = "+args.toString());
//                return "3333333";
//            }
//        });
//        String login = userService.login("111", "222");
//        Log.e("tag","login  = "+login);
    }



    public interface IUserRequest {
        @GET("userInfo/{userId}/")
        Call<ResponseBody> getUserInfo(@Path("userId") String userId);
    }


    /**
     * 测试方法
     */
    private void createRetrofit() {
        //Retrofit对象创建，这里用的是建造者模式创建
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        //动态代理生成代理对象$Proxy0，并用接口多态
        IUserRequest service = retrofit.create(IUserRequest.class);

        //请求对象
        Call<ResponseBody> userInfo = service.getUserInfo("10086");

        //同步请求
        try {
            Response<ResponseBody> response = userInfo.execute();
            ResponseBody body = response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //异步请求
        if(!userInfo.isExecuted()){
            userInfo.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    ResponseBody body = response.body();
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        }
    }


    public interface UserService{
        String login(String name,String password);
    }

    public class UserServiceImpl implements UserService {

        @Override
        public String login(String username, String password) {
            Toast.makeText(ActivityAboutRetrofit.this, "动态代理:username = "+username+" password = "+password, Toast.LENGTH_SHORT).show();
            return "4444";
        }

    }
}