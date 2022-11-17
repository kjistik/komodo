import { unit } from "./unit";

export interface product {
    idProducto: any,
    nombre_producto: string,
    cantidad_producto: number,
    active: boolean,
    precio_producto: number,
    producto_unidad: unit

}