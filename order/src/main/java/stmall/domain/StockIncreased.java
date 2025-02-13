package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String imgUrl;
    private String stock;
    private String productName;
    private String imgUrl;
    private String stock;
    private String productName;
    private String imgUrl;
    private String stock;
}
