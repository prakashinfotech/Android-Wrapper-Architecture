package ModelClass.RequestClass;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by Vivek on 8/10/2017.
 */

public class SaleOrder implements KvmSerializable {

    public String OrderStatus;
    public String CompanyId;
    public String IsVatFree;
    public String OrderResponseDate;
    public String SaleOrderClassId;
    public String PrintedDateTime;
    public String MiscInfo;
    public String SecureDiscounts;
    public String StoreId;
    public String CustomerId;
    public String TotalNetPrice;
    public String ScannerId;
    public String ReferenceCode;
    public String ExpectedDeliveryDate;
    public String SaleOrderType;
    public String CostCenterId;
    public String InboundMessageId;
    public String UtmostDeliveryDate;
    public String Description;
    public String ConversionId;
    public String DiscountPrice;
    public String ExportDateTime;
    public String WebshopId;
    public String IsRaise;
    public String UserId;
    public String TotalWeightedNetPrice;
    public String TotalGrossPrice;
    public String OrderResponseLog;
    public String IsCancelled;
    public String DeliveryCustomerId;
    public String CustomerContactId;
    public String DebtorId;
    public String PurchaseOrderId;
    public String OrderNumber;
    public String DeliveryAddressId;
    public String DiscountPercentage;
    public String TransportTypeId;

    @Override
    public Object getProperty(int index) {

        return null;
    }

    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void setProperty(int index, Object value) {

    }

    @Override
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {

    }
}
