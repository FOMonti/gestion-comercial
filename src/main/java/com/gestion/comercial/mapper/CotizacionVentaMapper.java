package com.gestion.comercial.mapper;

import com.gestion.comercial.dto.CotizacionVentaRequest;
import com.gestion.comercial.dto.CotizacionVentaResponse;
import com.gestion.comercial.entity.CotizacionVenta;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CotizacionVentaMapper {
    public CotizacionVenta cotizacionRequestAEntity(CotizacionVentaRequest cotizacionVentaRequest) {
        CotizacionVenta cotizacionVenta = new CotizacionVenta();
        cotizacionVenta.setSucursal(cotizacionVentaRequest.getSucursal());
        cotizacionVenta.setDniCliente(cotizacionVentaRequest.getDniCliente());
        cotizacionVenta.setPatente(cotizacionVentaRequest.getPatente());
        cotizacionVenta.setIdVendedor(cotizacionVentaRequest.getIdVendedor());
        cotizacionVenta.setGaratiaExtendida(cotizacionVentaRequest.getGarantiaExtendida());
        return cotizacionVenta;
    }

    public CotizacionVentaResponse cotizacionEntityAResponse(CotizacionVenta cotizacionVenta) {
        CotizacionVentaResponse cotizacionVentaResponse = new CotizacionVentaResponse();
        cotizacionVentaResponse.setId(cotizacionVenta.getId());
        cotizacionVentaResponse.setSucursal(cotizacionVenta.getSucursal());
        cotizacionVentaResponse.setNumeroCotizacion(cotizacionVenta.getNumeroCotizacion());
        cotizacionVentaResponse.setIdVendedor(cotizacionVenta.getIdVendedor());
        cotizacionVentaResponse.setPatente(cotizacionVenta.getPatente());
        cotizacionVentaResponse.setDniCliente(cotizacionVenta.getDniCliente());
        cotizacionVentaResponse.setFecha(cotizacionVenta.getFecha());
        cotizacionVentaResponse.setPrecioBase(cotizacionVenta.getPrecioBase());
        cotizacionVentaResponse.setImporteIVA(cotizacionVenta.getImporteIVA());
        cotizacionVentaResponse.setGastosAdministrativos(cotizacionVenta.getGastosAdministrativos());
        cotizacionVentaResponse.setPrecioTraslado(cotizacionVenta.getPrecioTraslado());
        cotizacionVentaResponse.setGastosGarantia(cotizacionVenta.getGastosGarantia());
        cotizacionVentaResponse.setGaratiaExtendida(cotizacionVenta.getGaratiaExtendida());
        cotizacionVentaResponse.setTotal(cotizacionVenta.getTotal());
        return cotizacionVentaResponse;
    }

    public List<CotizacionVentaResponse> cotizacionesVentaListAResponse(List<CotizacionVenta> cotizaciones){
        List<CotizacionVentaResponse> cotizacionesRet = new ArrayList<>();
        cotizaciones.forEach(cotizacion -> cotizacionesRet.add(cotizacionEntityAResponse(cotizacion)));
        return cotizacionesRet;
    }
}
