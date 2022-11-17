import { Component, OnInit } from '@angular/core';
import { Observable, timeInterval } from 'rxjs';
import { product } from 'src/app/models/product';
import { ProductService } from 'src/app/services/product/product.service';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})

export class ProductsComponent implements OnInit {

  products: product[] = []

  constructor(private service: ProductService) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.service.getProducts()
      .subscribe(products => this.products = products)
  }

  disable(product: product) {
    product.active = false
    this.service.changeProduct(product)
      .subscribe()
  }

}