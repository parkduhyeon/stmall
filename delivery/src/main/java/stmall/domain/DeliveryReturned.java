package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;

    public DeliveryReturned(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event
