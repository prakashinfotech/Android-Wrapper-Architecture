package ModelClass.RequestClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Vivek on 7/31/2017.
 */

public class address implements KvmSerializable {

    public int CustomerId;
    public String AddressType;
    public String Street;
    public String Address;
    public String AddressDescription;
    public String ZipCode;
    public String City;
    public int CountryId;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String Country;
    public int NumberPart1;

    @Override
    public Object getProperty(int index) {
        switch (index) {
            case 0:
                return CustomerId;
            case 1:
                return AddressType;
            case 2:
                return Street;
            case 3:
                return Address;
            case 4:
                return AddressDescription;
            case 5:
                return ZipCode;
            case 6:
                return City;
            case 7:
                return  CountryId;
            case 8:
                return  NumberPart1;
            case 9:
                return Country;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 10;
    }

    @Override
    public void setProperty(int index, Object value) {
        switch (index) {
            case 0:
                CustomerId=(int)value;
            case 1:
                AddressType=value.toString();
            case 2:
                Street=value.toString();
            case 3:
                Address=value.toString();
            case 4:
                AddressDescription=value.toString();
            case 5:
                ZipCode=value.toString();
            case 6:
                City=value.toString();
            case 7:
                 CountryId =(int)value;
            case 8:
                NumberPart1=(int)value;
            case 9:
                Country=value.toString();
        }
    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
        switch (index) {

            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "AddressType";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Street";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Address";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "AddressDescription";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ZipCode";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "City";
                break;
            case 7:
                info.type=PropertyInfo.INTEGER_CLASS;
                info.name = "CountryId";
            case 8:
                info.type=PropertyInfo.INTEGER_CLASS;
                info.name = "NumberPart1";
            case 9:
                info.type=PropertyInfo.STRING_CLASS;
                info.name = "Country";
            default:
                break;
        }
    }

//    public int getItemId() {
//        return ItemId;
//    }
//
//    public void setItemId(int itemId) {
//        ItemId = itemId;
//    }
//
//    public int getCompanyId() {
//        return CompanyId;
//    }
//
//    public void setCompanyId(int companyId) {
//        CompanyId = companyId;
//    }
//
//    public int getOrganizationId() {
//        return OrganizationId;
//    }
//
//    public void setOrganizationId(int organizationId) {
//        OrganizationId = organizationId;
//    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

//    public String getSource() {
//        return Source;
//    }
//
//    public void setSource(String source) {
//        Source = source;
//    }
//
//    public String getExternalCode() {
//        return ExternalCode;
//    }
//
//    public void setExternalCode(String externalCode) {
//        ExternalCode = externalCode;
//    }

    public int getNumberPart1() {
        return NumberPart1;
    }

    public void setNumberPart1(int numberPart1) {
        NumberPart1 = numberPart1;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

//    public String getNumberPart1() {
//        return NumberPart1;
//    }
//

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }
//    public void setNumberPart1(String numberPart1) {
//        NumberPart1 = numberPart1;
//    }
//
//    public String getNumberPart2() {
//        return NumberPart2;
//    }
//
//    public void setNumberPart2(String numberPart2) {
//        NumberPart2 = numberPart2;
//    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddressDescription() {
        return AddressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        AddressDescription = addressDescription;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

//    public int getCountryId() {
//        return CountryId;
//    }
//
//    public void setCountryId(int countryId) {
//        CountryId = countryId;
//    }
//
//    public String getCounty() {
//        return County;
//    }
//
//    public void setCounty(String county) {
//        County = county;
//    }
//
//    public String getAttentionOf() {
//        return AttentionOf;
//    }
//
//    public void setAttentionOf(String attentionOf) {
//        AttentionOf = attentionOf;
//    }

    //     ItemId
//     CompanyId
//     OrganizationId
//     CustomerId
//     Source
//     ExternalCode
//     AddressType
//     Street
//     NumberPart1
//     NumberPart2
//     Address
//     AddressDescription
//     ZipCode
//     City
//     CountryId
//     County
//     AttentionOf


}
