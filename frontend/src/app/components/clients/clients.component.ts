import { Component, OnInit } from '@angular/core';
import { subscribeOn } from 'rxjs';
import { client } from 'src/app/models/client';
import { ClientsService } from 'src/app/services/clients/clients.service';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.css']
})
export class ClientsComponent implements OnInit {

  clients: client[] = []

  constructor(private service: ClientsService) { }

  ngOnInit(): void {
    this.getClients();
  }

  getClients(): void {
    this.service.getClients()
      .subscribe(clients => this.clients = clients)
  }

  disable(client: client) {
    client.active = false
    this.service.changeProduct(client)
      .subscribe()
  }
}
