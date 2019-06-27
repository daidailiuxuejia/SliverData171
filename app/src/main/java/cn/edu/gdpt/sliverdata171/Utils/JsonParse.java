package cn.edu.gdpt.sliverdata171.Utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import cn.edu.gdpt.sliverdata171.Bean.SliverBean;

public class JsonParse {
    private static JsonParse instance;
    private JsonParse(){
    }
    public static JsonParse getInstance(){
        if (instance == null) {
            instance=new JsonParse();
        }
        return instance;
    }
    public List<SliverBean.ResultBean> getSlList(String json){
        Gson gson=new Gson();
        Type listType=new TypeToken<List<SliverBean.ResultBean>>(){
        }.getType();
        List<SliverBean.ResultBean> slList=gson.fromJson(json,listType);
        return slList;
    }
}
