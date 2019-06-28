package cn.edu.gdpt.sliverdata171.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SliverBean {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"1":{"variety":"Au100g","latestpri":"315.00","openpri":"313.00","maxpri":"315.00","minpri":"312.21","limit":"0.34%","yespri":"313.93","totalvol":"68.00","time":"2019-06-27 23:43:08"},"2":{"variety":"Au(T+N1)","latestpri":"319.20","openpri":"318.80","maxpri":"319.20","minpri":"317.60","limit":"0.30%","yespri":"318.25","totalvol":"986.00","time":"2019-06-27 23:43:11"},"3":{"variety":"Au(T+D)","latestpri":"313.38","openpri":"313.28","maxpri":"313.85","minpri":"312.05","limit":"0.02%","yespri":"313.31","totalvol":"43096.00","time":"2019-06-27 23:43:07"},"4":{"variety":"Au99.99","latestpri":"313.00","openpri":"312.10","maxpri":"315.00","minpri":"312.10","limit":"-0.28%","yespri":"313.89","totalvol":"15421.00","time":"2019-06-27 23:42:25"},"5":{"variety":"Au99.95","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"313.29","totalvol":"--","time":"2019-06-27 23:30:08"},"6":{"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2019-06-27 19:50:01"},"7":{"variety":"Ag99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"3677.00","totalvol":"--","time":"2019-06-27 19:50:01"},"8":{"variety":"Ag(T+D)","latestpri":"3632.00","openpri":"3631.00","maxpri":"3644.00","minpri":"3625.00","limit":"-0.06%","yespri":"3634.00","totalvol":"1053762.00","time":"2019-06-27 23:43:15"},"9":{"variety":"Au(T+N2)","latestpri":"316.60","openpri":"315.85","maxpri":"316.65","minpri":"314.75","limit":"0.29%","yespri":"315.70","totalvol":"13078.00","time":"2019-06-27 23:41:01"},"10":{"variety":"Pt99.95","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"186.14","totalvol":"--","time":"2019-06-27 23:20:34"},"11":{"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"271.60","totalvol":"--","time":"2019-06-27 19:50:01"},"12":{"variety":"AU99.99","latestpri":"313.00","openpri":"312.10","maxpri":"315.00","minpri":"312.10","limit":"-0.28%","yespri":"313.89","totalvol":"154210.00","time":"2019-06-27 23:42:25"},"13":{"variety":"MAUTD","latestpri":"313.45","openpri":"313.08","maxpri":"313.79","minpri":"312.00","limit":"0.07%","yespri":"313.23","totalvol":"55604.00","time":"2019-06-27 23:43:15"},"14":{"variety":"IAU99.99","latestpri":"310.00","openpri":"312.00","maxpri":"312.00","minpri":"310.00","limit":"-0.47%","yespri":"311.47","totalvol":"80.00","time":"2019-06-27 23:43:13"},"15":{"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"280.00","totalvol":"--","time":"2019-06-27 22:12:23"},"16":{"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2019-06-27 19:50:01"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * 1 : {"variety":"Au100g","latestpri":"315.00","openpri":"313.00","maxpri":"315.00","minpri":"312.21","limit":"0.34%","yespri":"313.93","totalvol":"68.00","time":"2019-06-27 23:43:08"}
         * 2 : {"variety":"Au(T+N1)","latestpri":"319.20","openpri":"318.80","maxpri":"319.20","minpri":"317.60","limit":"0.30%","yespri":"318.25","totalvol":"986.00","time":"2019-06-27 23:43:11"}
         * 3 : {"variety":"Au(T+D)","latestpri":"313.38","openpri":"313.28","maxpri":"313.85","minpri":"312.05","limit":"0.02%","yespri":"313.31","totalvol":"43096.00","time":"2019-06-27 23:43:07"}
         * 4 : {"variety":"Au99.99","latestpri":"313.00","openpri":"312.10","maxpri":"315.00","minpri":"312.10","limit":"-0.28%","yespri":"313.89","totalvol":"15421.00","time":"2019-06-27 23:42:25"}
         * 5 : {"variety":"Au99.95","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"313.29","totalvol":"--","time":"2019-06-27 23:30:08"}
         * 6 : {"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2019-06-27 19:50:01"}
         * 7 : {"variety":"Ag99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"3677.00","totalvol":"--","time":"2019-06-27 19:50:01"}
         * 8 : {"variety":"Ag(T+D)","latestpri":"3632.00","openpri":"3631.00","maxpri":"3644.00","minpri":"3625.00","limit":"-0.06%","yespri":"3634.00","totalvol":"1053762.00","time":"2019-06-27 23:43:15"}
         * 9 : {"variety":"Au(T+N2)","latestpri":"316.60","openpri":"315.85","maxpri":"316.65","minpri":"314.75","limit":"0.29%","yespri":"315.70","totalvol":"13078.00","time":"2019-06-27 23:41:01"}
         * 10 : {"variety":"Pt99.95","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"186.14","totalvol":"--","time":"2019-06-27 23:20:34"}
         * 11 : {"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"271.60","totalvol":"--","time":"2019-06-27 19:50:01"}
         * 12 : {"variety":"AU99.99","latestpri":"313.00","openpri":"312.10","maxpri":"315.00","minpri":"312.10","limit":"-0.28%","yespri":"313.89","totalvol":"154210.00","time":"2019-06-27 23:42:25"}
         * 13 : {"variety":"MAUTD","latestpri":"313.45","openpri":"313.08","maxpri":"313.79","minpri":"312.00","limit":"0.07%","yespri":"313.23","totalvol":"55604.00","time":"2019-06-27 23:43:15"}
         * 14 : {"variety":"IAU99.99","latestpri":"310.00","openpri":"312.00","maxpri":"312.00","minpri":"310.00","limit":"-0.47%","yespri":"311.47","totalvol":"80.00","time":"2019-06-27 23:43:13"}
         * 15 : {"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"280.00","totalvol":"--","time":"2019-06-27 22:12:23"}
         * 16 : {"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2019-06-27 19:50:01"}
         */

        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("7")
        private _$7Bean _$7;
        @SerializedName("8")
        private _$8Bean _$8;
        @SerializedName("9")
        private _$9Bean _$9;
        @SerializedName("10")
        private _$10Bean _$10;
        @SerializedName("11")
        private _$11Bean _$11;
        @SerializedName("12")
        private _$12Bean _$12;
        @SerializedName("13")
        private _$13Bean _$13;
        @SerializedName("14")
        private _$14Bean _$14;
        @SerializedName("15")
        private _$15Bean _$15;
        @SerializedName("16")
        private _$16Bean _$16;

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public _$2Bean get_$2() {
            return _$2;
        }

        public void set_$2(_$2Bean _$2) {
            this._$2 = _$2;
        }

        public _$3Bean get_$3() {
            return _$3;
        }

        public void set_$3(_$3Bean _$3) {
            this._$3 = _$3;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public _$6Bean get_$6() {
            return _$6;
        }

        public void set_$6(_$6Bean _$6) {
            this._$6 = _$6;
        }

        public _$7Bean get_$7() {
            return _$7;
        }

        public void set_$7(_$7Bean _$7) {
            this._$7 = _$7;
        }

        public _$8Bean get_$8() {
            return _$8;
        }

        public void set_$8(_$8Bean _$8) {
            this._$8 = _$8;
        }

        public _$9Bean get_$9() {
            return _$9;
        }

        public void set_$9(_$9Bean _$9) {
            this._$9 = _$9;
        }

        public _$10Bean get_$10() {
            return _$10;
        }

        public void set_$10(_$10Bean _$10) {
            this._$10 = _$10;
        }

        public _$11Bean get_$11() {
            return _$11;
        }

        public void set_$11(_$11Bean _$11) {
            this._$11 = _$11;
        }

        public _$12Bean get_$12() {
            return _$12;
        }

        public void set_$12(_$12Bean _$12) {
            this._$12 = _$12;
        }

        public _$13Bean get_$13() {
            return _$13;
        }

        public void set_$13(_$13Bean _$13) {
            this._$13 = _$13;
        }

        public _$14Bean get_$14() {
            return _$14;
        }

        public void set_$14(_$14Bean _$14) {
            this._$14 = _$14;
        }

        public _$15Bean get_$15() {
            return _$15;
        }

        public void set_$15(_$15Bean _$15) {
            this._$15 = _$15;
        }

        public _$16Bean get_$16() {
            return _$16;
        }

        public void set_$16(_$16Bean _$16) {
            this._$16 = _$16;
        }

        public static class _$1Bean {
            /**
             * variety : Au100g
             * latestpri : 315.00
             * openpri : 313.00
             * maxpri : 315.00
             * minpri : 312.21
             * limit : 0.34%
             * yespri : 313.93
             * totalvol : 68.00
             * time : 2019-06-27 23:43:08
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$2Bean {
            /**
             * variety : Au(T+N1)
             * latestpri : 319.20
             * openpri : 318.80
             * maxpri : 319.20
             * minpri : 317.60
             * limit : 0.30%
             * yespri : 318.25
             * totalvol : 986.00
             * time : 2019-06-27 23:43:11
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$3Bean {
            /**
             * variety : Au(T+D)
             * latestpri : 313.38
             * openpri : 313.28
             * maxpri : 313.85
             * minpri : 312.05
             * limit : 0.02%
             * yespri : 313.31
             * totalvol : 43096.00
             * time : 2019-06-27 23:43:07
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$4Bean {
            /**
             * variety : Au99.99
             * latestpri : 313.00
             * openpri : 312.10
             * maxpri : 315.00
             * minpri : 312.10
             * limit : -0.28%
             * yespri : 313.89
             * totalvol : 15421.00
             * time : 2019-06-27 23:42:25
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$5Bean {
            /**
             * variety : Au99.95
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 313.29
             * totalvol : --
             * time : 2019-06-27 23:30:08
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$6Bean {
            /**
             * variety : Au50g
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 255.00
             * totalvol : --
             * time : 2019-06-27 19:50:01
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$7Bean {
            /**
             * variety : Ag99.99
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 3677.00
             * totalvol : --
             * time : 2019-06-27 19:50:01
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$8Bean {
            /**
             * variety : Ag(T+D)
             * latestpri : 3632.00
             * openpri : 3631.00
             * maxpri : 3644.00
             * minpri : 3625.00
             * limit : -0.06%
             * yespri : 3634.00
             * totalvol : 1053762.00
             * time : 2019-06-27 23:43:15
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$9Bean {
            /**
             * variety : Au(T+N2)
             * latestpri : 316.60
             * openpri : 315.85
             * maxpri : 316.65
             * minpri : 314.75
             * limit : 0.29%
             * yespri : 315.70
             * totalvol : 13078.00
             * time : 2019-06-27 23:41:01
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$10Bean {
            /**
             * variety : Pt99.95
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 186.14
             * totalvol : --
             * time : 2019-06-27 23:20:34
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$11Bean {
            /**
             * variety : AU995
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 271.60
             * totalvol : --
             * time : 2019-06-27 19:50:01
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$12Bean {
            /**
             * variety : AU99.99
             * latestpri : 313.00
             * openpri : 312.10
             * maxpri : 315.00
             * minpri : 312.10
             * limit : -0.28%
             * yespri : 313.89
             * totalvol : 154210.00
             * time : 2019-06-27 23:42:25
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$13Bean {
            /**
             * variety : MAUTD
             * latestpri : 313.45
             * openpri : 313.08
             * maxpri : 313.79
             * minpri : 312.00
             * limit : 0.07%
             * yespri : 313.23
             * totalvol : 55604.00
             * time : 2019-06-27 23:43:15
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$14Bean {
            /**
             * variety : IAU99.99
             * latestpri : 310.00
             * openpri : 312.00
             * maxpri : 312.00
             * minpri : 310.00
             * limit : -0.47%
             * yespri : 311.47
             * totalvol : 80.00
             * time : 2019-06-27 23:43:13
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$15Bean {
            /**
             * variety : IAU100G
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 280.00
             * totalvol : --
             * time : 2019-06-27 22:12:23
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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

        public static class _$16Bean {
            /**
             * variety : IAU99.5
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 237.80
             * totalvol : --
             * time : 2019-06-27 19:50:01
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;

            public String getVariety() {
                return variety;
            }

            public void setVariety(String variety) {
                this.variety = variety;
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
}

