package cn.edu.chd.douban.util;

/**
 * 服务端返回给客户端的数据类型
 */
public class JsonResult {
    private int state=1;//状态码，0表示失败，1表示成功
    private String message="ok";//具体的状态信息
    private Object data;//具体返回给客户端的数据

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 构造方法
     * @param message 状态码
     */
    public JsonResult(String message) {
        this.message = message;
    }

    /**
     * 构造方法
     * @param message 状态信息
     * @param data 状态码
     */
    public JsonResult(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    /**
     * 构造方法
     * @param data 具体数据
     */
    public JsonResult(Object data) {
        this.data = data;
    }

    /**
     * 构造方法
     * @param e 可抛出类型对象
     */
    public JsonResult(Throwable e) {
        this.state=0;
        this.message=e.getMessage();
    }

}
