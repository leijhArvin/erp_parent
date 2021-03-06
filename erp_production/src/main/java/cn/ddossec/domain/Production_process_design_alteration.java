package cn.ddossec.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Production_process_design_alteration {

    /**
     *序
     */
    private Integer id;

    /**
     *设计单ID
     */
    private Integer sjdId;


    private  Product_auditTable product_auditTable;

    private Production_process_design_sheet production_process_design_sheet;
    /**
     *审核单ID
     */
    private Integer shdId;

    /**
     *修改时间
     */
    private String edit_date;

    /**
     *修改次数
     */
    private Integer edit_count;

    private String userName;

    public Production_process_design_alteration(Integer id, Integer sjdId, Integer shdId, String edit_date, Integer edit_count, String userName) {
        this.id = id;
        this.sjdId = sjdId;
        this.shdId = shdId;
        this.edit_date = edit_date;
        this.edit_count = edit_count;
        this.userName = userName;
    }
}
