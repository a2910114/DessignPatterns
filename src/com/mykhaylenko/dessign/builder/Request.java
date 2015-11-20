package com.mykhaylenko.dessign.builder;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Request {
    private String param1;
    private String param2;
    private String param3;
    private String param4;
    private String param5;

    public Request(RequestBuilder builder) {
        this.param1 = builder.param1;
        this.param2 = builder.param2;
        this.param3 = builder.param3;
        this.param4 = builder.param4;
        this.param5 = builder.param5;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Request[\n");
        builder.append("\tParam1: ").append(param1).append("\n");
        builder.append("\tParam2: ").append(param2).append("\n");
        builder.append("\tParam3: ").append(param3).append("\n");
        builder.append("\tParam4: ").append(param4).append("\n");
        builder.append("\tParam5: ").append(param5).append("\n");
        builder.append("]");

        return builder.toString();
    }

    public static class RequestBuilder{
        private String param1;
        private String param2;
        private String param3;
        private String param4;
        private String param5;

        public RequestBuilder param1(String param1) {
            this.param1 = param1;
            return this;
        }

        public RequestBuilder param2(String param2) {
            this.param2 = param2;
            return this;
        }

        public RequestBuilder param3(String param3) {
            this.param3 = param3;
            return this;
        }

        public RequestBuilder param4(String param4) {
            this.param4 = param4;
            return this;
        }

        public RequestBuilder param5(String param5) {
            this.param1 = param1;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
