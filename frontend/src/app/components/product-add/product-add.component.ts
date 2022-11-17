import { Component, OnInit } from '@angular/core';
import { unit } from 'src/app/models/unit';
import { UnitService } from 'src/app/services/units/unit.service';
import { ProductService } from 'src/app/services//product/product.service';
import { product } from 'src/app/models/product';
import { Location } from '@angular/common';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  constructor(private unitService: UnitService, private productService: ProductService,
    private location: Location) { }

  ngOnInit(): void {
    this.getUnits()
  }

  precio: number = 0

  cantidad: number = 0

  units: unit[] = []

  products: product[] = []


  selectedUnit: unit = this.units[1]

  getProducts() {
    this.productService.getProducts()
      .subscribe(products => this.products = products)
  }

  getUnits() {
    this.unitService.getUnits()
      .subscribe(units => this.units = units)
  }

  addProduct(nombre_producto: string, cantidad_producto: number, precio_producto: number, producto_unidad: unit) {
    const idProducto = null
    const active = true
    if (!this.selectedUnit) { return; }
    this.productService.addProduct(
      { idProducto, nombre_producto, cantidad_producto, active, precio_producto, producto_unidad } as product)
      .subscribe((product: product) => this.products.push(product))
    this.cantidad = 0
    this.precio = 0
    this.selectedUnit = this.units[1]
    window.location.reload()
  }

  goBack() {
    this.location.back()
  }
}