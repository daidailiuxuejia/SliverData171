package cn.edu.gdpt.sliverdata171;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.sliverdata171.Fragment.DataFragment;
import cn.edu.gdpt.sliverdata171.Fragment.HomeFragment;
import cn.edu.gdpt.sliverdata171.Fragment.MeFragment;

public class MainActivity extends AppCompatActivity {
    private TextView tv_main_title;
    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private List<Fragment>fragments=new ArrayList<Fragment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        setViewPager();
        setListener();
    }
    private void setView(){
        tv_main_title=(TextView)findViewById(R.id.tv_main_title);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
    }
    private void setViewPager(){
        fragments.add(new HomeFragment());
        fragments.add(new DataFragment());
        fragments.add(new MeFragment());
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return fragments.get(i);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        viewPager.setCurrentItem(0);
    }
    private void setListener(){
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        radioGroup.check(R.id.rb_home);
                        tv_main_title.setText("首页");
                        break;
                    case 1:
                        radioGroup.check(R.id.rb_data);
                        tv_main_title.setText("数据");
                        break;
                    case 2:
                        radioGroup.check(R.id.rb_me);
                        tv_main_title.setText("我的");
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i){
                    case R.id.rb_home:
                        viewPager.setCurrentItem(0,false);break;
                    case R.id.rb_data:
                        viewPager.setCurrentItem(1,false);break;
                    case R.id.rb_me:
                        viewPager.setCurrentItem(2,false);break;
                }
            }
        });
    }
}
