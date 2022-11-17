import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { unit } from 'src/app/models/unit';

@Injectable({
  providedIn: 'root'
})
export class UnitService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  private productsURL = "http://localhost:8080/api/unidades/todos"

  getUnits(): Observable<unit[]> {
    return this.http.get<unit[]>(this.productsURL, this.httpOptions)
  }
}