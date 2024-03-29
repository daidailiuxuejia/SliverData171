package cn.edu.gdpt.sliverdata171.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.gdpt.sliverdata171.R;
import cn.edu.gdpt.sliverdata171.Utils.DBUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_psw,et_user_name;
    private ImageView iv_show_psw;
    private TextView tv_quick_register,tv_forget_psw;
    private Button btn_login;
    private DBUtils dbUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setView();
        dbUtils=DBUtils.getInstance(getApplicationContext());
    }
    private void setView(){
        et_psw=(EditText)findViewById(R.id.et_psw);
        et_user_name=(EditText)findViewById(R.id.et_user_name);
        iv_show_psw=(ImageView)findViewById(R.id.iv_show_psw);
        tv_quick_register=(TextView)findViewById(R.id.tv_quick_register);
        tv_forget_psw=(TextView)findViewById(R.id.tv_forget_psw);
        btn_login=(Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        tv_quick_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_quick_register:
                Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_login:
                String userName=et_user_name.getText().toString().trim();
                String psw=et_psw.getText().toString().trim();
                if (TextUtils.isEmpty(userName)){
                    Toast.makeText(LoginActivity.this,"请输入用户名",Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(psw)){
                    Toast.makeText(LoginActivity.this,"请输入密码",Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userLogin(userName,psw)){
                    Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent data=new Intent();
                    data.putExtra("isLogin",true);
                    data.putExtra("loginUserName",userName);
                    setResult(RESULT_OK,data);
                    finish();
                }
                break;
        }
    }
}
