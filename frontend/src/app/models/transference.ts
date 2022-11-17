import { product } from "./product";
import { movement } from "./movement";

export interface transference {
    idTransference: any,
    dateTransference: Date,
    transferedProduct: product,
    transference_movement: movement
}