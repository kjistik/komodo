import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { movement } from 'src/app/models/movement';

@Injectable({
  providedIn: 'root'
})
export class MovementService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  private productsURL = "http://localhost:8080/api/movimientos/todos"
  private addURL = "http://localhost:8080/api/movimientos/nuevo"
  private changeURL = "http://localhost:8080/api/movimientos/cambiar"

  getMovements(): Observable<movement[]> {
    return this.http.get<movement[]>(this.productsURL, this.httpOptions)
  }

  addProduct(movement: movement): Observable<any> {
    return this.http.post<movement>(this.addURL, movement, this.httpOptions)
  }

  changeProduct(movement: movement): Observable<any> {
    return this.http.put(`${this.changeURL}/${movement.idMovement}`, movement, this.httpOptions)
  }
}