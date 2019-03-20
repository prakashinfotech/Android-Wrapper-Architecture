package webservice;

/**
 * Created by samir
 * on 5/2/2018 12:21 PM.
 */

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.lang.*;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class AddProductInfo implements KvmSerializable {
    public long mainBarcode;
    public int articleGroupId;
    public int assortmentId;
    public int brandId;
    public int classificationLevel1IdField;
    public int classificationLevel2IdField;
    public int classificationLevel3IdField;
    public int classificationLevel4IdField;
    public int classificationLevel5IdField;
    public double consumerUnitToSaleUnitFactor;
    public String description;
    public int productCategoryId;
    public double grossPrice;
    public int itemId;
    public String note1;
    public String note2;
    public String note3;
    public String note4;
    public double defaultSaleAmount;

    public AddProductInfo() {
    }

    public AddProductInfo(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("MainBarcode")) {
            Object obj = soapObject.getProperty("MainBarcode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mainBarcode = Long.parseLong(j.toString());
            } else if (obj != null && obj instanceof Number) {
                mainBarcode = (Long) obj;
            }
        }
        if (soapObject.hasProperty("ArticleGroupId")) {
            Object obj = soapObject.getProperty("ArticleGroupId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                articleGroupId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                articleGroupId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("AssortmentId")) {
            Object obj = soapObject.getProperty("AssortmentId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                assortmentId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                assortmentId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("BrandId")) {
            Object obj = soapObject.getProperty("BrandId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                brandId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                brandId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ClassificationLevel1Id")) {
            Object obj = soapObject.getProperty("ClassificationLevel1Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                classificationLevel1IdField = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                classificationLevel1IdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ClassificationLevel2Id")) {
            Object obj = soapObject.getProperty("ClassificationLevel2Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                classificationLevel2IdField = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                classificationLevel2IdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ClassificationLevel3Id")) {
            Object obj = soapObject.getProperty("ClassificationLevel3Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                classificationLevel3IdField = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                classificationLevel3IdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ClassificationLevel4Id")) {
            Object obj = soapObject.getProperty("ClassificationLevel4Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                classificationLevel4IdField = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                classificationLevel4IdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ClassificationLevel5Id")) {
            Object obj = soapObject.getProperty("ClassificationLevel5Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                classificationLevel5IdField = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                classificationLevel5IdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ConsumerUnitToSaleUnitFactor")) {
            Object obj = soapObject.getProperty("ConsumerUnitToSaleUnitFactor");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                consumerUnitToSaleUnitFactor = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                consumerUnitToSaleUnitFactor = (Double) obj;
            }
        }
        if (soapObject.hasProperty("Description")) {
            Object obj = soapObject.getProperty("Description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                description = j.toString();
            } else if (obj != null && obj instanceof String) {
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("GrossPrice")) {
            Object obj = soapObject.getProperty("GrossPrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                grossPrice = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                grossPrice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("ProductCategoryId")) {
            Object obj = soapObject.getProperty("ProductCategoryId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                productCategoryId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                productCategoryId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ItemId")) {
            Object obj = soapObject.getProperty("ItemId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                itemId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                itemId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Note1")) {
            Object obj = soapObject.getProperty("Note1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                note1 = j.toString();
            } else if (obj != null && obj instanceof String) {
                note1 = (String) obj;
            }
        }
        if (soapObject.hasProperty("Note2")) {
            Object obj = soapObject.getProperty("Note2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                note2 = j.toString();
            } else if (obj != null && obj instanceof String) {
                note2 = (String) obj;
            }
        }
        if (soapObject.hasProperty("Note3")) {
            Object obj = soapObject.getProperty("Note3");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                note3 = j.toString();
            } else if (obj != null && obj instanceof String) {
                note3 = (String) obj;
            }
        }
        if (soapObject.hasProperty("Note4")) {
            Object obj = soapObject.getProperty("Note4");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                note4 = j.toString();
            } else if (obj != null && obj instanceof String) {
                note4 = (String) obj;
            }
        }
        if (soapObject.hasProperty("DefaultSaleAmount")) {
            Object obj = soapObject.getProperty("DefaultSaleAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                defaultSaleAmount = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                defaultSaleAmount = (Double) obj;
            }
        }

    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return mainBarcode;
            case 1:
                return articleGroupId;
            case 2:
                return assortmentId;
            case 3:
                return brandId;
            case 4:
                return classificationLevel1IdField;
            case 5:
                return classificationLevel2IdField;
            case 6:
                return classificationLevel3IdField;
            case 7:
                return classificationLevel4IdField;
            case 8:
                return classificationLevel5IdField;
            case 9:
                return consumerUnitToSaleUnitFactor;
            case 10:
                return description;
            case 11:
                return grossPrice;
            case 12:
                return productCategoryId;
            case 13:
                return itemId;
            case 14:
                return note1;
            case 15:
                return note2;
            case 16:
                return note3;
            case 17:
                return note4;
            case 18:
                return defaultSaleAmount;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 19;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = Long.class;
                info.name = "MainBarcode";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ArticleGroupId";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "AssortmentId";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "BrandId";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ClassificationLevel1Id";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ClassificationLevel2Id";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ClassificationLevel3Id";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ClassificationLevel4Id";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ClassificationLevel5Id";
                break;
            case 9:
                info.type = Double.class;
                info.name = "ConsumerUnitToSaleUnitFactor";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Description";
                break;
            case 11:
                info.type = Double.class;
                info.name = "GrossPrice";
                break;
            case 12:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductCategoryId";
                break;
            case 13:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Note1";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Note2";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Note3";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Note4";
                break;
            case 18:
                info.type = Double.class;
                info.name = "DefaultSaleAmount";
                break;

        }
    }

//    @Override //    public String getInnerText() { //        return null; //    } // // //    @Override //    public void setInnerText(String s) { //    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
