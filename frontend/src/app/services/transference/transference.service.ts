import { Injectable } from '@angular/core';
import { transference } from 'src/app/models/transference';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransferenceService {

  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  private productsURL = "http://localhost:8080/api/transferencias/todos"
  private addURL = "http://localhost:8080/api/transferencias/nuevo"
  private changeURL = "http://localhost:8080/api/transferencias/cambiar"

  getProducts(): Observable<transference[]> {
    return this.http.get<transference[]>(this.productsURL, this.httpOptions)
  }

  addProduct(transference: transference): Observable<any> {
    return this.http.post<transference>(this.addURL, transference, this.httpOptions)
  }

  changeProduct(transference: transference): Observable<any> {
    return this.http.put(`${this.changeURL}/${transference.idTransference}`, transference, this.httpOptions)
  }
}