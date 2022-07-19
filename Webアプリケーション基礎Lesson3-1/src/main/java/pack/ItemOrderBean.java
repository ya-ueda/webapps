package pack;

import java.io.Serializable;
import java.util.Date;
/**
 * データベースに登録されている商品取引データを表すクラス。
 * item_orderのDTOでBeanオブジェクト
 * @author 上田和
 *
 */
public class ItemOrderBean implements Serializable {

    /**
     * 注文番号
     */
    private int orderNum;

    /**
     * 商品番号
     */
    private String itemNum;

    /**
     * 個数
     */
    private int quantity;

    /**
     * 注文者
     */
    private String staffNum;

    /**
     * 注文日
     */
    private Date orderDate;

    /**
     * コンストラクタ
     */
    public ItemOrderBean() {
    }
    
    /**
     * 注文番号を受け取るゲッター
     * @return orderNum 注文番号
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * @param orderNum セットする注文番号
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
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
     * 個数を受け取るゲッター
     * @return quantity 個数
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 個数を代入するセッター
     * @param quantity セットする個数
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * 注文者のIDを受け取るゲッター
     * @return staffNum 注文者のID
     */
    public String getStaffNum() {
        return staffNum;
    }

    /**
     * 注文者のIDを代入するセッター
     * @param staffNum セットする注文者のID
     */
    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    /**
     * 注文日を受け取るゲッター
     * @return orderDate 注文日
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * 注文日を代入するセッター
     * @param orderDate セットする注文日
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
