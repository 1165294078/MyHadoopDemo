package zjc.pojo;

public class Datas {
    private int id;
    private String content;
    private String crawlTime;
    private String createTime;
    private String score;
    private String menberLeve;
    private String color;
    private String productSiz;
    private String saleValue;


    public Datas() {
    }




    public Datas(int id, String content, String crawlTime, String createTime, String score, String menberLeve, String color, String productSiz, String saleValue) {
        this.id = id;
        this.content = content;
        this.crawlTime = crawlTime;
        this.createTime = createTime;
        this.score = score;
        this.menberLeve = menberLeve;
        this.color = color;
        this.productSiz = productSiz;
        this.saleValue = saleValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMenberLeve() {
        return menberLeve;
    }

    public void setMenberLeve(String menberLeve) {
        this.menberLeve = menberLeve;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductSiz() {
        return productSiz;
    }

    public void setProductSiz(String productSiz) {
        this.productSiz = productSiz;
    }

    public String getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(String saleValue) {
        this.saleValue = saleValue;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", crawlTime='" + crawlTime + '\'' +
                ", createTime='" + createTime + '\'' +
                ", score='" + score + '\'' +
                ", menberLeve='" + menberLeve + '\'' +
                ", color='" + color + '\'' +
                ", productSiz='" + productSiz + '\'' +
                ", saleValue='" + saleValue + '\'' +
                '}';
    }
}
