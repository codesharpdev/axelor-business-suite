/**
 * Axelor Business Solutions
 * <p>
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 * <p>
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.csv.script;

import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.apps.sale.service.SaleOrderService;
import com.google.inject.Inject;

import java.util.Map;

public class ImportSaleOrder {

    protected SaleOrderService saleOrderService;

    @Inject
    public ImportSaleOrder(SaleOrderService saleOrderService) {
        this.saleOrderService = saleOrderService;
    }

    public Object importAddressStr(Object bean, Map<String,Object> values) {
        assert bean instanceof SaleOrder;

        SaleOrder saleOrder = (SaleOrder) bean;
        saleOrderService.computeAddressStr(saleOrder);
        return saleOrder;
    }
}