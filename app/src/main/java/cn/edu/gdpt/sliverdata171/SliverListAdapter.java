package cn.edu.gdpt.sliverdata171;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.edu.gdpt.sliverdata171.Bean.SliverBean;

public class SliverListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<SliverBean.ResultBean> sbl;
    public void setData(List<SliverBean.ResultBean> sbl){
        this.sbl=sbl;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sliver_list_item,viewGroup,false);
        SliverViewHolder viewHolder=new SliverViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        final SliverBean.ResultBean bean=sbl.get(i);
        ((SliverViewHolder)holder).type.setText(bean.get_$1().getVariety());
        ((SliverViewHolder)holder).openpri.setText(bean.get_$1().getOpenpri());
        ((SliverViewHolder)holder).maxpri.setText(bean.get_$1().getMaxpri());
        ((SliverViewHolder)holder).minpri.setText(bean.get_$1().getMinpri());
        ((SliverViewHolder)holder).limit.setText(bean.get_$1().getLimit());
        ((SliverViewHolder)holder).yespri.setText(bean.get_$1().getYespri());
        ((SliverViewHolder)holder).totalvol.setText(bean.get_$1().getTotalvol());
        ((SliverViewHolder)holder).time.setText(bean.get_$1().getTime());
    }

    @Override
    public int getItemCount() {
        return sbl.size();
    }
    public class SliverViewHolder extends RecyclerView.ViewHolder{
        public TextView type, latestpri, openpri, maxpri, minpri, limit, yespri, totalvol,time;
        public ImageView latestpri_icon, openpri_icon, maxpri_icon, minpri_icon, limit_icon, yespri_icon, totalvol_icon;
        public SliverViewHolder(View itemView){
            super(itemView);
            type=(TextView)itemView.findViewById(R.id.type);
            latestpri=(TextView)itemView.findViewById(R.id.latestpri);
            openpri=(TextView)itemView.findViewById(R.id.openingpri);
            maxpri=(TextView)itemView.findViewById(R.id.maxpri);
            minpri=(TextView)itemView.findViewById(R.id.minpri);
            limit=(TextView)itemView.findViewById(R.id.limit);
            yespri=(TextView)itemView.findViewById(R.id.yespri);
            totalvol=(TextView)itemView.findViewById(R.id.totalvol);
            time=(TextView)itemView.findViewById(R.id.time);
            latestpri_icon=(ImageView) itemView.findViewById(R.id.latestpri_icon);
            openpri_icon=(ImageView) itemView.findViewById(R.id.openingpri_icon);
            maxpri_icon=(ImageView) itemView.findViewById(R.id.maxpri_icon);
            minpri_icon=(ImageView) itemView.findViewById(R.id.minpri_icon);
            limit_icon=(ImageView) itemView.findViewById(R.id.limit_icon);
            yespri_icon=(ImageView) itemView.findViewById(R.id.yespri_icon);
            totalvol_icon=(ImageView) itemView.findViewById(R.id.totalvol_icon);
        }
    }
}
