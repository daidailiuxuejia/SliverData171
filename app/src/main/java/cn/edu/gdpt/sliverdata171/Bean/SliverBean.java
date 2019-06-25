package cn.edu.gdpt.sliverdata171.Bean;

import java.util.List;

public class SliverBean {
    private String status;
    private String msg;
    //"variety":"Ag(T+D)",		/*品种*/
    //			"latestpri":"6585.00",		/*最新价*/
    //			"openpri":"6712.00",		/*开盘价*/
    //			"maxpri":"6721.00",		/*最高价*/
    //			"minpri":"6581.00",		/*最低价*/
    //			"limit":"-1.98%",		/*涨跌幅*/
    //			"yespri":"6718.00",		/*昨收价*/
    //			"totalvol":"1564524.0000",	/*总成交量*/
    //			"time":"2012-12-19 15:29:59"	/*更新时间*/
    private List<ResultEntity> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public static class ResultEntity{
        private String Type;
        private String latestpri;
        private String openpri;
        private String maxpri;
        private String minpri;
        private String limit;
        private String yespri;
        private String totalvol;
        private String time;

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public String getLatestpri() {
            return latestpri;
        }

        public void setLatestpri(String latestpri) {
            this.latestpri = latestpri;
        }

        public String getOpenpri() {
            return openpri;
        }

        public void setOpenpri(String openpri) {
            this.openpri = openpri;
        }

        public String getMaxpri() {
            return maxpri;
        }

        public void setMaxpri(String maxpri) {
            this.maxpri = maxpri;
        }

        public String getMinpri() {
            return minpri;
        }

        public void setMinpri(String minpri) {
            this.minpri = minpri;
        }

        public String getLimit() {
            return limit;
        }

        public void setLimit(String limit) {
            this.limit = limit;
        }

        public String getYespri() {
            return yespri;
        }

        public void setYespri(String yespri) {
            this.yespri = yespri;
        }

        public String getTotalvol() {
            return totalvol;
        }

        public void setTotalvol(String totalvol) {
            this.totalvol = totalvol;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
