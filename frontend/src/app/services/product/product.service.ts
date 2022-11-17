import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { product } from 'src/app/models/product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  private productsURL = "http://localhost:8080/api/productos/todos"
  private addURL = "http://localhost:8080/api/productos/nuevo"
  private changeURL = "http://localhost:8080/api/productos/cambiar"

  getProducts(): Observable<product[]> {
    return this.http.get<product[]>(this.productsURL, this.httpOptions)
  }

  addProduct(product: product): Observable<any> {
    return this.http.post<product>(this.addURL, product, this.httpOptions)
  }

  changeProduct(product: product): Observable<any> {
    return this.http.put(`${this.changeURL}/${product.idProducto}`, product, this.httpOptions)
  }
}