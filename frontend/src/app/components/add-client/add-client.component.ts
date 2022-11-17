import { Component, OnInit } from '@angular/core';
import { client } from 'src/app/models/client';
import { ClientsService } from 'src/app/services/clients/clients.service';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.css']
})
export class AddClientComponent implements OnInit {

  constructor(private service: ClientsService) { }

  ngOnInit(): void {
  }

  clients: client[] = []

  addClient(client_email: string, client_lastName: string, client_name: string,
    client_phone: number, client_phone_ch: number, client_street: string,
    localidad: string) {
    const idClient = null
    const active = true
    this.service.addClient(
      {
        idClient, active, client_email, client_lastName, client_name, client_phone, client_phone_ch,
        client_street, localidad
      } as client)
      .subscribe((client: client) => this.clients.push(client)); window.location.reload();
  }

  getClients() {
    this.service.getClients()
      .subscribe(clients => this.clients = clients)
  }

}