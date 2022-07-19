package pack;

import java.io.Serializable;

/**
 * データベースに登録されている商品データを表すクラス。
 * itemのDTOでBeanオブジェクト。
 * @author 上田和
 *
 */
public class ItemBean implements Serializable {

    /**
     * 商品番号
     */
    private String itemNum;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 価格
     */
    private int price;

    /**
     * 商品詳細
     */
    private String itemDetail;
    /**
     * コンストラクタ
     */
    public ItemBean() {

    }

    /**
     * 商品番号を受け取るゲッター
     * @return itemNum 商品番号
     */
    public String getItemNum() {
        return itemNum;
    }

    /**
     * 商品番号を代入するセッター
     * @param itemNum セットする商品番号
     */
    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    /**
     * 商品名を受け取るゲッター
     * @return itemName 商品名
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 商品名を代入するセッター
     * @param itemName セットする商品名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 価格を受け取るゲッター
     * @return price 価格
     */
    public int getPrice() {
        return price;
    }

    /**
     * 価格を代入するセッター
     * @param price セットする価格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 商品詳細を受け取るゲッター
     * @return itemDtail 商品詳細
     */
    public String getItemDetail() {
        return itemDetail;
    }

    /**
     * 商品詳細を代入するセッター
     * @param itemDtail セットする商品詳細
     */
    public void setItemDetail(String itemDtail) {
        this.itemDetail = itemDtail;
    }

}
