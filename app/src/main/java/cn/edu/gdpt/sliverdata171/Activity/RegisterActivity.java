package cn.edu.gdpt.sliverdata171.Activity;

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

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_psw, et_user_name;
    private ImageView iv_show_psw;
    private Button btn_register;
    private String userName,psw;
    private DBUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setView();
        dbUtils=DBUtils.getInstance(getApplicationContext());
    }

    private void setView() {
        et_psw = (EditText) findViewById(R.id.et_psw);
        et_user_name = (EditText) findViewById(R.id.et_user_name);
        iv_show_psw = (ImageView) findViewById(R.id.iv_show_psw);
        btn_register=(Button)findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
                userName=et_user_name.getText().toString().trim();
                psw=et_psw.getText().toString().trim();
                if (TextUtils.isEmpty(userName)){
                    Toast.makeText(RegisterActivity.this,"请输入用户名",Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(psw)){
                    Toast.makeText(RegisterActivity.this,"请输入密码",Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userIsExist(userName)){
                    Toast.makeText(RegisterActivity.this,"用户名已存在",Toast.LENGTH_SHORT).show();
                    return;
                }else if (dbUtils.userRegister(userName,psw)){
                    Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                    RegisterActivity.this.finish();
                }else {
                    Toast.makeText(RegisterActivity.this,"注册失败",Toast.LENGTH_SHORT).show();
                    return;
                }
                break;
        }
    }
}
