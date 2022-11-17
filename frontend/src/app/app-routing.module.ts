import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductsComponent } from './components/products/products.component';
import { ProductAddComponent } from './components/product-add/product-add.component';
import { ClientsComponent } from './components/clients/clients.component';
import { AddClientComponent } from './components/add-client/add-client.component';
const routes: Routes = [
  { path: 'productos', component: ProductsComponent },
  { path: 'nuevo-producto', component: ProductAddComponent },
  { path: 'clientes', component: ClientsComponent },
  { path: 'nuevo-cliente', component: AddClientComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
