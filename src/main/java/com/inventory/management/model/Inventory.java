package com.inventory.management.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Inventory {

    private String id;
    private String name;
}
