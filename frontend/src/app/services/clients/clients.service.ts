import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { client } from 'src/app/models/client';

@Injectable({
  providedIn: 'root'
})
export class ClientsService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  private clientsURL = "http://localhost:8080/api/clientes/todos"
  private addURL = "http://localhost:8080/api/clientes/nuevo"
  private changeURL = "http://localhost:8080/api/clientes/cambiar"

  constructor(private http: HttpClient) { }

  getClients(): Observable<client[]> {
    return this.http.get<client[]>(this.clientsURL, this.httpOptions)
  }

  addClient(client: client): Observable<any> {
    return this.http.post<client>(this.addURL, client, this.httpOptions)
  }

  changeProduct(client: client): Observable<any> {
    return this.http.put(`${this.changeURL}/${client.idClient}`, client, this.httpOptions)
  }
}