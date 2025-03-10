package com.springboot.training.spaceover.spacemission.manager.domain.response.inbound;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetSpaceShipResponse {

    private Long id;

    private String name;

    private String status;

    private BigInteger maxOccupancy;

    private String type;

}
