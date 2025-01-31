package com.technostack.aio.dto.request;

import com.technostack.aio.enumerations.OS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestGeoArea {

    private String name;
    private Long geoAreaTypeId;

    private String upGeoAreaType;
}
