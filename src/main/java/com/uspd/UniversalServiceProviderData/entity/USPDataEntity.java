/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:10 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class USPDataEntity {

    @Id
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String website;
}
