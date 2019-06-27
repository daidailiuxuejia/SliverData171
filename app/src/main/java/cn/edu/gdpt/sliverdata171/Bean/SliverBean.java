package cn.edu.gdpt.sliverdata171.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SliverBean {


    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"1":{"variety":"Au100g","latestpri":"314.00","openpri":"312.49","maxpri":"315.49","minpri":"312.49","limit":"-0.10%","yespri":"314.31","totalvol":"382.00","time":"2019-06-27 15:28:25"},"2":{"variety":"Au(T+N1)","latestpri":"318.85","openpri":"316.75","maxpri":"320.60","minpri":"316.75","limit":"-0.16%","yespri":"319.35","totalvol":"2278.00","time":"2019-06-27 15:30:03"},"3":{"variety":"Au(T+D)","latestpri":"313.33","openpri":"313.50","maxpri":"315.79","minpri":"312.90","limit":"-0.43%","yespri":"314.69","totalvol":"121610.00","time":"2019-06-27 15:30:03"},"4":{"variety":"Au99.99","latestpri":"314.00","openpri":"315.00","maxpri":"316.00","minpri":"312.00","limit":"-0.14%","yespri":"314.44","totalvol":"164721.00","time":"2019-06-27 15:30:03"},"5":{"variety":"Au99.95","latestpri":"313.10","openpri":"314.40","maxpri":"314.60","minpri":"313.00","limit":"-0.41%","yespri":"314.40","totalvol":"666.00","time":"2019-06-27 15:30:03"},"6":{"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2019-06-27 15:30:03"},"7":{"variety":"Ag99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"3677.00","totalvol":"--","time":"2019-06-26 20:00:00"},"8":{"variety":"Ag(T+D)","latestpri":"3635.00","openpri":"3643.00","maxpri":"3661.00","minpri":"3629.00","limit":"-0.36%","yespri":"3648.00","totalvol":"2894446.00","time":"2019-06-27 15:30:03"},"9":{"variety":"Au(T+N2)","latestpri":"315.60","openpri":"315.90","maxpri":"318.20","minpri":"315.60","limit":"-0.60%","yespri":"317.50","totalvol":"6726.00","time":"2019-06-27 15:30:03"},"10":{"variety":"Pt99.95","latestpri":"186.15","openpri":"186.57","maxpri":"186.57","minpri":"186.00","limit":"0.65%","yespri":"184.94","totalvol":"86.00","time":"2019-06-27 15:08:17"},"11":{"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"271.60","totalvol":"--","time":"2019-06-26 20:00:00"},"12":{"variety":"AU99.99","latestpri":"314.00","openpri":"315.00","maxpri":"316.00","minpri":"312.00","limit":"-0.14%","yespri":"314.44","totalvol":"1647210.00","time":"2019-06-27 15:30:03"},"13":{"variety":"MAUTD","latestpri":"313.15","openpri":"313.63","maxpri":"315.95","minpri":"312.88","limit":"-0.50%","yespri":"314.71","totalvol":"136944.00","time":"2019-06-27 15:30:03"},"14":{"variety":"IAU99.99","latestpri":"310.35","openpri":"311.00","maxpri":"312.20","minpri":"310.35","limit":"-0.37%","yespri":"311.49","totalvol":"104454.00","time":"2019-06-27 15:11:14"},"15":{"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"280.00","totalvol":"--","time":"2019-06-27 15:27:22"},"16":{"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2019-06-26 20:00:00"}}]
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
         * 1 : {"variety":"Au100g","latestpri":"314.00","openpri":"312.49","maxpri":"315.49","minpri":"312.49","limit":"-0.10%","yespri":"314.31","totalvol":"382.00","time":"2019-06-27 15:28:25"}
         * 2 : {"variety":"Au(T+N1)","latestpri":"318.85","openpri":"316.75","maxpri":"320.60","minpri":"316.75","limit":"-0.16%","yespri":"319.35","totalvol":"2278.00","time":"2019-06-27 15:30:03"}
         * 3 : {"variety":"Au(T+D)","latestpri":"313.33","openpri":"313.50","maxpri":"315.79","minpri":"312.90","limit":"-0.43%","yespri":"314.69","totalvol":"121610.00","time":"2019-06-27 15:30:03"}
         * 4 : {"variety":"Au99.99","latestpri":"314.00","openpri":"315.00","maxpri":"316.00","minpri":"312.00","limit":"-0.14%","yespri":"314.44","totalvol":"164721.00","time":"2019-06-27 15:30:03"}
         * 5 : {"variety":"Au99.95","latestpri":"313.10","openpri":"314.40","maxpri":"314.60","minpri":"313.00","limit":"-0.41%","yespri":"314.40","totalvol":"666.00","time":"2019-06-27 15:30:03"}
         * 6 : {"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2019-06-27 15:30:03"}
         * 7 : {"variety":"Ag99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"3677.00","totalvol":"--","time":"2019-06-26 20:00:00"}
         * 8 : {"variety":"Ag(T+D)","latestpri":"3635.00","openpri":"3643.00","maxpri":"3661.00","minpri":"3629.00","limit":"-0.36%","yespri":"3648.00","totalvol":"2894446.00","time":"2019-06-27 15:30:03"}
         * 9 : {"variety":"Au(T+N2)","latestpri":"315.60","openpri":"315.90","maxpri":"318.20","minpri":"315.60","limit":"-0.60%","yespri":"317.50","totalvol":"6726.00","time":"2019-06-27 15:30:03"}
         * 10 : {"variety":"Pt99.95","latestpri":"186.15","openpri":"186.57","maxpri":"186.57","minpri":"186.00","limit":"0.65%","yespri":"184.94","totalvol":"86.00","time":"2019-06-27 15:08:17"}
         * 11 : {"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"271.60","totalvol":"--","time":"2019-06-26 20:00:00"}
         * 12 : {"variety":"AU99.99","latestpri":"314.00","openpri":"315.00","maxpri":"316.00","minpri":"312.00","limit":"-0.14%","yespri":"314.44","totalvol":"1647210.00","time":"2019-06-27 15:30:03"}
         * 13 : {"variety":"MAUTD","latestpri":"313.15","openpri":"313.63","maxpri":"315.95","minpri":"312.88","limit":"-0.50%","yespri":"314.71","totalvol":"136944.00","time":"2019-06-27 15:30:03"}
         * 14 : {"variety":"IAU99.99","latestpri":"310.35","openpri":"311.00","maxpri":"312.20","minpri":"310.35","limit":"-0.37%","yespri":"311.49","totalvol":"104454.00","time":"2019-06-27 15:11:14"}
         * 15 : {"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"280.00","totalvol":"--","time":"2019-06-27 15:27:22"}
         * 16 : {"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2019-06-26 20:00:00"}
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
             * latestpri : 314.00
             * openpri : 312.49
             * maxpri : 315.49
             * minpri : 312.49
             * limit : -0.10%
             * yespri : 314.31
             * totalvol : 382.00
             * time : 2019-06-27 15:28:25
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
             * latestpri : 318.85
             * openpri : 316.75
             * maxpri : 320.60
             * minpri : 316.75
             * limit : -0.16%
             * yespri : 319.35
             * totalvol : 2278.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 313.33
             * openpri : 313.50
             * maxpri : 315.79
             * minpri : 312.90
             * limit : -0.43%
             * yespri : 314.69
             * totalvol : 121610.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 314.00
             * openpri : 315.00
             * maxpri : 316.00
             * minpri : 312.00
             * limit : -0.14%
             * yespri : 314.44
             * totalvol : 164721.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 313.10
             * openpri : 314.40
             * maxpri : 314.60
             * minpri : 313.00
             * limit : -0.41%
             * yespri : 314.40
             * totalvol : 666.00
             * time : 2019-06-27 15:30:03
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
             * time : 2019-06-27 15:30:03
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
             * time : 2019-06-26 20:00:00
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
             * latestpri : 3635.00
             * openpri : 3643.00
             * maxpri : 3661.00
             * minpri : 3629.00
             * limit : -0.36%
             * yespri : 3648.00
             * totalvol : 2894446.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 315.60
             * openpri : 315.90
             * maxpri : 318.20
             * minpri : 315.60
             * limit : -0.60%
             * yespri : 317.50
             * totalvol : 6726.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 186.15
             * openpri : 186.57
             * maxpri : 186.57
             * minpri : 186.00
             * limit : 0.65%
             * yespri : 184.94
             * totalvol : 86.00
             * time : 2019-06-27 15:08:17
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
             * time : 2019-06-26 20:00:00
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
             * latestpri : 314.00
             * openpri : 315.00
             * maxpri : 316.00
             * minpri : 312.00
             * limit : -0.14%
             * yespri : 314.44
             * totalvol : 1647210.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 313.15
             * openpri : 313.63
             * maxpri : 315.95
             * minpri : 312.88
             * limit : -0.50%
             * yespri : 314.71
             * totalvol : 136944.00
             * time : 2019-06-27 15:30:03
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
             * latestpri : 310.35
             * openpri : 311.00
             * maxpri : 312.20
             * minpri : 310.35
             * limit : -0.37%
             * yespri : 311.49
             * totalvol : 104454.00
             * time : 2019-06-27 15:11:14
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
             * time : 2019-06-27 15:27:22
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
             * time : 2019-06-26 20:00:00
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

