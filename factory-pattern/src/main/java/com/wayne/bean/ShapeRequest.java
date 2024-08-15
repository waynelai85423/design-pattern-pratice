package com.wayne.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ShapeRequest {
    Double high  = 0.0;

    Double width = 0.0;

    Double radius = 0.0;

}
