(function(){"use strict";var t={468:function(t,e,o){var n=o(963),l=o(252),r=o.p+"img/bars-solid.9f0a0e99.svg";const c={class:"bg-dark container-fluid text-white"},a={class:"navbar navbar-expand-lg bg-body-tertiary"},s={class:"container-fluid"},i=(0,l._)("button",{class:"navbar-toggler justify-self-right",type:"button","data-bs-toggle":"collapse","data-bs-target":"#navbarNavDropdown","aria-controls":"navbarNavDropdown","aria-expanded":"false","aria-label":"Toggle navigation"},[(0,l._)("span",{class:"navbar-toggler-icon"},[(0,l._)("img",{src:r})])],-1),d={class:"collapse navbar-collapse",id:"navbarNavDropdown"},u={class:"navbar-nav"},p={class:"nav-item"},m={class:"nav-item"},_={class:"nav-item"},h=(0,l._)("li",{class:"nav-item dropdown"},[(0,l._)("a",{class:"nav-link dropdown-toggle",href:"#",role:"button","data-bs-toggle":"dropdown","aria-expanded":"false"}," Ventas y pedidos "),(0,l._)("ul",{class:"dropdown-menu dropdown-menu-dark"},[(0,l._)("li",null,[(0,l._)("a",{class:"dropdown-item",href:"#"},"Ventas")]),(0,l._)("li",null,[(0,l._)("a",{class:"dropdown-item",href:"#"},"Movimientos")]),(0,l._)("li",null,[(0,l._)("a",{class:"dropdown-item",href:"#"},"Pedidos")])])],-1);function f(t,e){const o=(0,l.up)("router-link"),n=(0,l.up)("router-view");return(0,l.wg)(),(0,l.iD)("div",c,[(0,l._)("nav",a,[(0,l._)("div",s,[(0,l.Wm)(o,{to:"/clients",class:"link navbar-brand"},{default:(0,l.w5)((()=>[(0,l.Uk)("Komodo")])),_:1}),i,(0,l._)("div",d,[(0,l._)("ul",u,[(0,l._)("li",p,[(0,l.Wm)(o,{class:"nav-link link active","aria-current":"page",to:"/clients"},{default:(0,l.w5)((()=>[(0,l.Uk)("Clientes")])),_:1})]),(0,l._)("li",m,[(0,l.Wm)(o,{class:"nav-link link",to:"/products"},{default:(0,l.w5)((()=>[(0,l.Uk)("Productos")])),_:1})]),(0,l._)("li",_,[(0,l.Wm)(o,{class:"nav-link link",to:"/providers"},{default:(0,l.w5)((()=>[(0,l.Uk)("Proveedores")])),_:1})]),h])])])]),(0,l.Wm)(n)])}var b=o(744);const v={},w=(0,b.Z)(v,[["render",f]]);var g=w,y=o(201);function k(t,e,o,n,r,c){const a=(0,l.up)("ClientsVue");return(0,l.wg)(),(0,l.j4)(a)}var C=o(577);const P={class:"container-sm col-10 self-align-around"},U=(0,l._)("h5",{class:"beginning"},"Clientes",-1),V=(0,l._)("button",{scope:"row",class:"btn btn-secondary container col-2"},"Añadir cliente",-1),N={class:"table table-dark table-striped"},j=(0,l._)("thead",null,[(0,l._)("tr",{scope:"row"},[(0,l._)("th",{scope:"col"},"Nombre"),(0,l._)("th",{scope:"col"},"Correo"),(0,l._)("th",{scope:"col"},"Teléfono"),(0,l._)("th",{scope:"col"},"Localidad"),(0,l._)("th",{scope:"col"},"Dirección")])],-1),x={scope:"row"},D={scope:"col"},z={scope:"col"},q={scope:"col"},E={scope:"col"},O={scope:"col"},T=(0,l._)("button",{class:"btn btn-secondary"},"Editar cliente",-1);function Z(t,e,o,n,r,c){const a=(0,l.up)("router-link");return(0,l.wg)(),(0,l.iD)("div",P,[U,(0,l.Wm)(a,{to:"/clients/create"},{default:(0,l.w5)((()=>[V])),_:1}),(0,l._)("table",N,[j,(0,l._)("tbody",null,[((0,l.wg)(!0),(0,l.iD)(l.HY,null,(0,l.Ko)(r.clients,(t=>((0,l.wg)(),(0,l.iD)("tr",x,[(0,l._)("td",D,(0,C.zw)(t.client_name)+" "+(0,C.zw)(t.client_lastName),1),(0,l._)("td",z,(0,C.zw)(t.client_mail),1),(0,l._)("td",q,(0,C.zw)(t.client_phone),1),(0,l._)("td",E,(0,C.zw)(t.client_city),1),(0,l._)("td",O,(0,C.zw)(t.client_address),1),(0,l.Wm)(a,{to:"/clients/edit/"+t.id_clients},{default:(0,l.w5)((()=>[T])),_:2},1032,["to"])])))),256))])])])}var S={name:"clients",methods:{async getClients(){fetch("http://localhost:8080/api/clientes/todos").then((t=>t.json())).then((t=>this.clients=t))}},data(){return{clients:null}},mounted(){this.getClients()}};const W=(0,b.Z)(S,[["render",Z]]);var L=W,K={name:"Clientsview",components:{ClientsVue:L}};const M=(0,b.Z)(K,[["render",k]]);var H=M;function Y(t,e,o,n,r,c){const a=(0,l.up)("EditClients");return(0,l.wg)(),(0,l.j4)(a)}const $={class:"container-fluid col-sm-6 self-align-around"},A={key:0,class:"row"},J=(0,l._)("h5",{class:"beginning"},"Cliente",-1),B={key:0},Q={key:1},F={class:"row div"},G=(0,l._)("h5",null,"Editar",-1),I=(0,l._)("label",{class:"col-sm-1",for:"nombre"},"Nombre: ",-1),R=(0,l._)("label",{class:"col-sm-1 input-item",for:"apellido"},"Apellido: ",-1),X=(0,l._)("label",{class:"form-label input-item",for:"correo"},"Correo: ",-1),tt=(0,l._)("label",{class:"form-label input-item",for:"telefono"},"Teléfono: ",-1),et=(0,l._)("label",{class:"form-label input-item",for:"ciudad"},"Localidad: ",-1),ot=(0,l._)("label",{class:"form-label input-item",for:"direccion"},"Dirección: ",-1),nt=(0,l._)("button",{class:"btn btn-secondary last",type:"submit"},"Editar",-1);function lt(t,e,o,r,c,a){return(0,l.wg)(),(0,l.iD)("div",$,[c.client?((0,l.wg)(),(0,l.iD)("section",A,[J,(0,l._)("span",null,"Nombre completo: "+(0,C.zw)(c.client.client_name)+" "+(0,C.zw)(c.client.client_lastName),1),(0,l._)("span",null,"Correo: "+(0,C.zw)(c.client.client_mail),1),(0,l._)("span",null,"Teléfono: "+(0,C.zw)(c.client.client_phone),1),c.client.client_city&&c.client.client_address?((0,l.wg)(),(0,l.iD)("span",B,"Dirección: "+(0,C.zw)(c.client.client_city)+", "+(0,C.zw)(c.client.client_address),1)):c.client.client_city&&!c.client.client_address?((0,l.wg)(),(0,l.iD)("span",Q,"Localidad: "+(0,C.zw)(c.client.client_city),1)):(0,l.kq)("",!0)])):(0,l.kq)("",!0),(0,l._)("div",F,[G,(0,l._)("form",{onSubmit:e[7]||(e[7]=(0,n.iM)((t=>a.edit()),["prevent"])),class:"form-group form-group-sm"},[I,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[0]||(e[0]=t=>c.name=t),class:"col-lg-3 form-control form-control-sm",type:"text",placeholder:"",id:"nombre"},null,512),[[n.nr,c.name]]),(0,l._)("span",null,[R,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[1]||(e[1]=t=>c.lastName=t),class:"col-lg-3 form-control form-control-sm",type:"text",placeholder:"",id:"apellido"},null,512),[[n.nr,c.lastName]])]),(0,l._)("span",null,[X,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[2]||(e[2]=t=>c.mail=t),class:"col-sm-3 form-control form-control-sm",type:"email",placeholder:"correo@ejemplo.com",id:"correo"},null,512),[[n.nr,c.mail]])]),(0,l._)("span",null,[tt,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[3]||(e[3]=t=>c.phone=t),class:"col-sm-3 form-control form-control-sm",type:"text","min-length":"9","max-length":"10",pattern:"[0-9]{9,10}",placeholder:"0000 000000",id:"telefono"},null,512),[[n.nr,c.phone]])]),(0,l._)("span",null,[et,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[4]||(e[4]=t=>c.city=t),class:"col-sm-3 form-control form-control-sm",type:"text",placeholder:"ej: Los Quirquinchos",id:"city"},null,512),[[n.nr,c.city]])]),(0,l._)("span",null,[ot,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[5]||(e[5]=t=>c.address=t),class:"col-sm-3 form-control last form-control-sm",type:"text",placeholder:"ej: Borgarino 126",id:"direccion"},null,512),[[n.nr,c.address]])]),nt,(0,l.Uk)(),(0,l._)("button",{class:"last btn btn-secondary",onClick:e[6]||(e[6]=t=>a.back())},"Volver")],32)])])}var rt={name:"EditClients",data(){return{id:0,client:null,name:"",lastName:"",city:"",address:"",mail:"",phone:""}},methods:{async getClient(t){fetch("http://localhost:8080/api/clientes/cliente/"+this.$route.params.id).then((t=>t.json())).then((t=>(this.client=t,console.log(t))))},changeClient(){fetch("http://localhost:8080/api/clientes/cambiar/"+this.id,{method:"PUT",headers:{"Content-Type":"application/json"},body:JSON.stringify(this.client)}),this.back()},edit(){this.name&&(this.client.client_name=this.name),this.lastName&&(this.client.client_lastName=this.lastName),this.city&&(this.client.client_city=this.city),this.address&&(this.client.client_address=this.address),this.mail&&(this.client.client_mail=this.mail),this.phone&&(this.client.client_phone=this.phone),this.changeClient()},back(){Xe.back()}},created(){this.id=this.$route.params.id,this.getClient()},mounted(){}};const ct=(0,b.Z)(rt,[["render",lt]]);var at=ct,st={name:"EditClientsview",components:{EditClients:at}};const it=(0,b.Z)(st,[["render",Y]]);var dt=it;function ut(t,e,o,n,r,c){const a=(0,l.up)("CreateClients");return(0,l.wg)(),(0,l.j4)(a)}const pt={class:"container-fluid col-sm-6 self-align-around"},mt={class:"row div"},_t=(0,l._)("h5",null,"Nuevo cliente",-1),ht=(0,l._)("label",{class:"col-sm-1",for:"nombre"},"Nombre: ",-1),ft=(0,l._)("label",{class:"col-sm-1 input-item",for:"apellido"},"Apellido: ",-1),bt=(0,l._)("label",{class:"form-label input-item",for:"correo"},"Correo: ",-1),vt=(0,l._)("label",{class:"form-label input-item",for:"telefono"},"Teléfono: ",-1),wt=(0,l._)("label",{class:"form-label input-item",for:"ciudad"},"Localidad: ",-1),gt=(0,l._)("label",{class:"form-label input-item",for:"direccion"},"Dirección: ",-1),yt=(0,l._)("button",{class:"btn btn-secondary last",type:"submit"},"Crear",-1);function kt(t,e,o,r,c,a){return(0,l.wg)(),(0,l.iD)("div",pt,[(0,l._)("div",mt,[_t,(0,l._)("form",{onSubmit:e[7]||(e[7]=(0,n.iM)((t=>a.submit()),["prevent"])),class:"form-group form-group-sm"},[ht,(0,l.wy)((0,l._)("input",{required:"","onUpdate:modelValue":e[0]||(e[0]=t=>c.client.client_name=t),class:"col-lg-3 form-control form-control-sm",type:"text",placeholder:"",id:"nombre"},null,512),[[n.nr,c.client.client_name]]),(0,l._)("span",null,[ft,(0,l.wy)((0,l._)("input",{required:"","onUpdate:modelValue":e[1]||(e[1]=t=>c.client.client_lastName=t),class:"col-lg-3 form-control form-control-sm",type:"text",placeholder:"",id:"apellido"},null,512),[[n.nr,c.client.client_lastName]])]),(0,l._)("span",null,[bt,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[2]||(e[2]=t=>c.client.client_mail=t),class:"col-sm-3 form-control form-control-sm",type:"email",placeholder:"correo@ejemplo.com",id:"correo"},null,512),[[n.nr,c.client.client_mail]])]),(0,l._)("span",null,[vt,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[3]||(e[3]=t=>c.client.client_phone=t),class:"col-sm-3 form-control form-control-sm",type:"text","min-length":"9","max-length":"10",pattern:"[0-9]{9,10}",placeholder:"0000 000000",id:"telefono"},null,512),[[n.nr,c.client.client_phone]])]),(0,l._)("span",null,[wt,(0,l.wy)((0,l._)("input",{required:"","onUpdate:modelValue":e[4]||(e[4]=t=>c.client.client_city=t),class:"col-sm-3 form-control form-control-sm",type:"text",placeholder:"ej: Los Quirquinchos",id:"city"},null,512),[[n.nr,c.client.client_city]])]),(0,l._)("span",null,[gt,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[5]||(e[5]=t=>c.client.client_adress=t),class:"col-sm-3 form-control last form-control-sm",type:"text",placeholder:"ej: Borgarino 126",id:"direccion"},null,512),[[n.nr,c.client.client_adress]])]),yt,(0,l.Uk)(),(0,l._)("button",{class:"last btn btn-secondary",onClick:e[6]||(e[6]=t=>a.back())},"Volver")],32)])])}var Ct={name:"CreateClients",data(){return{client:{active:!0,client_adress:null,client_city:null,client_lastName:null,client_mail:null,client_name:null,client_phone:null,id_clients:null},name:null,lastName:null,mail:null,phone:null,city:null,adress:null}},methods:{submit(){fetch("http://localhost:8080/api/clientes/nuevo",{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(this.client)}),this.back()},back(){Xe.back()}}};const Pt=(0,b.Z)(Ct,[["render",kt]]);var Ut=Pt,Vt={name:"reateClientsview",components:{CreateClients:Ut}};const Nt=(0,b.Z)(Vt,[["render",ut]]);var jt=Nt;function xt(t,e,o,n,r,c){const a=(0,l.up)("ProductsVue");return(0,l.wg)(),(0,l.j4)(a)}const Dt={class:"container-sm col-10 self-align-around"},zt=(0,l._)("h5",{class:"beginning"},"Productos",-1),qt=(0,l._)("button",{scope:"row",class:"btn btn-secondary container col-2"},"Crear producto",-1),Et={class:"table table-dark table-striped"},Ot=(0,l._)("thead",null,[(0,l._)("tr",{scope:"row"},[(0,l._)("th",{scope:"col"},"Nombre"),(0,l._)("th",{scope:"col"},"Precio"),(0,l._)("th",{scope:"col"},"Cantidad")])],-1),Tt={scope:"row"},Zt={scope:"col"},St={scope:"col"},Wt={scope:"col"},Lt=(0,l._)("button",{class:"btn btn-secondary"},"Editar Producto",-1);function Kt(t,e,o,n,r,c){const a=(0,l.up)("router-link");return(0,l.wg)(),(0,l.iD)("div",Dt,[zt,(0,l.Wm)(a,{to:"/products/create"},{default:(0,l.w5)((()=>[qt])),_:1}),(0,l._)("table",Et,[Ot,(0,l._)("tbody",null,[((0,l.wg)(!0),(0,l.iD)(l.HY,null,(0,l.Ko)(r.products,(t=>((0,l.wg)(),(0,l.iD)("tr",Tt,[(0,l._)("td",Zt,(0,C.zw)(t.product_name),1),(0,l._)("td",St,"$"+(0,C.zw)(t.product_ppu),1),(0,l._)("td",Wt,(0,C.zw)(t.product_quantity)+" "+(0,C.zw)(t.product_unit.unitsName),1),(0,l.Wm)(a,{to:"/products/edit/"+t.id_product},{default:(0,l.w5)((()=>[Lt])),_:2},1032,["to"])])))),256))])])])}var Mt={name:"products",methods:{async getProducts(){fetch("http://localhost:8080/api/productos/todos").then((t=>t.json())).then((t=>this.products=t))}},data(){return{products:null}},created(){this.getProducts()}};const Ht=(0,b.Z)(Mt,[["render",Kt]]);var Yt=Ht,$t={name:"ProductsView",components:{ProductsVue:Yt}};const At=(0,b.Z)($t,[["render",xt]]);var Jt=At;function Bt(t,e,o,n,r,c){const a=(0,l.up)("EditProducts");return(0,l.wg)(),(0,l.j4)(a)}const Qt={class:"container-fluid col-sm-6 self-align-around"},Ft={key:0,class:"row"},Gt=(0,l._)("h5",{class:"beginning"},"Producto",-1),It={class:"row div"},Rt=(0,l._)("h5",null,"Editar",-1),Xt=(0,l._)("label",{class:"col-sm-1",for:"nombre"},"Producto: ",-1),te=(0,l._)("label",{class:"form-label input-item",for:"precio"},"Precio: ",-1),ee=(0,l._)("label",{class:"form-label input-item",for:"cantidad"},"Cantidad: ",-1),oe=(0,l._)("label",{for:"select",class:"form-label input-item"},"Unidades:",-1),ne=["value"],le=(0,l._)("br",null,null,-1),re=(0,l._)("button",{class:"btn btn-secondary last",type:"submit"},"Editar",-1);function ce(t,e,o,r,c,a){return(0,l.wg)(),(0,l.iD)("div",Qt,[c.product?((0,l.wg)(),(0,l.iD)("section",Ft,[Gt,(0,l._)("span",null,"Producto: "+(0,C.zw)(c.product.product_name),1),(0,l._)("span",null,"Precio: "+(0,C.zw)(c.product.product_ppu),1),(0,l._)("span",null,"Cantidad: "+(0,C.zw)(c.product.product_quantity)+" "+(0,C.zw)(c.product.product_unit.unitsName),1)])):(0,l.kq)("",!0),(0,l._)("div",It,[Rt,(0,l._)("form",{onSubmit:e[5]||(e[5]=(0,n.iM)((t=>a.edit()),["prevent"])),class:"form-group form-group-sm"},[Xt,(0,l.wy)((0,l._)("input",{placeholder:'Perfume para ropa "Saphirus" lavanda x250ml',"onUpdate:modelValue":e[0]||(e[0]=t=>c.product_name=t),class:"col-lg-3 form-control form-control-sm",type:"text",id:"nombre"},null,512),[[n.nr,c.product_name]]),(0,l._)("span",null,[te,(0,l.wy)((0,l._)("input",{placeholder:"350.00","onUpdate:modelValue":e[1]||(e[1]=t=>c.product_ppu=t),class:"col-sm-3 form-control form-control-sm",type:"text",id:"precio"},null,512),[[n.nr,c.product_ppu]])]),(0,l._)("span",null,[ee,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[2]||(e[2]=t=>c.product_quantity=t),class:"col-sm-3 form-control form-control-sm",type:"text","min-length":"9","max-length":"10",pattern:"[0-9]{1,10}",id:"cantidad"},null,512),[[n.nr,c.product_quantity]])]),(0,l._)("span",null,[oe,(0,l.wy)((0,l._)("select",{"onUpdate:modelValue":e[3]||(e[3]=t=>c.product_unit=t),class:"last col-sm-3 form-control-3 form-control-sm",id:"select"},[((0,l.wg)(!0),(0,l.iD)(l.HY,null,(0,l.Ko)(c.units,(t=>((0,l.wg)(),(0,l.iD)("option",{value:t},(0,C.zw)(t.unitsName),9,ne)))),256))],512),[[n.bM,c.product_unit]])]),le,re,(0,l.Uk)(),(0,l._)("button",{class:"last btn btn-secondary",onClick:e[4]||(e[4]=t=>a.back())},"Volver")],32)])])}var ae={name:"EditProducts",created(){this.id=this.$route.params.id,this.getUnits(),this.getProduct()},mounted(){this.id_product=this.id},methods:{async getProduct(t){fetch("http://localhost:8080/api/productos/producto/"+this.$route.params.id).then((t=>t.json())).then((t=>(this.product=t,console.log(t))))},async getUnits(){fetch("http://localhost:8080/api/unidades/todos").then((t=>t.json())).then((t=>(this.units=t,console.log(t))))},edit(){this.product_name&&(this.product.product_name=this.product_name),this.product_ppu&&(this.product.product_ppu=this.product_ppu),this.product_quantity&&(this.product.product_quantity=this.product_quantity),this.product_unit&&(this.product.product_unit=this.product_unit),console.log(this.product),fetch("http://localhost:8080/api/productos/cambiar/"+this.id,{method:"PUT",headers:{"Content-Type":"application/json"},body:JSON.stringify(this.product)}),this.back()},back(){Xe.back()}},data(){return{product:void 0,product_name:null,product_ppu:null,product_quantity:null,product_unit:null,active:!0,id_product:null,units:null}}};const se=(0,b.Z)(ae,[["render",ce]]);var ie=se,de={components:{EditProducts:ie},name:"EditProductView"};const ue=(0,b.Z)(de,[["render",Bt]]);var pe=ue;function me(t,e,o,n,r,c){const a=(0,l.up)("CreateProducts");return(0,l.wg)(),(0,l.j4)(a)}const _e={class:"container-fluid col-sm-6 self-align-around"},he={class:"row div"},fe=(0,l._)("h5",null,"Nuevo cliente",-1),be=(0,l._)("label",{class:"col-sm-1",for:"nombre"},"Nombre: ",-1),ve=(0,l._)("label",{class:"col-sm-1 input-item",for:"cantidad"},"Cantidad: ",-1),we=(0,l._)("label",{class:"form-label input-item",for:"precio"},"Precio: ",-1),ge=(0,l._)("label",{for:"select",class:"form-label input-item"},"Unidades:",-1),ye=["value"],ke=(0,l._)("br",null,null,-1),Ce=(0,l._)("button",{class:"btn btn-secondary last",type:"submit"},"Crear",-1);function Pe(t,e,o,r,c,a){return(0,l.wg)(),(0,l.iD)("div",_e,[(0,l._)("div",he,[fe,(0,l._)("form",{onSubmit:e[5]||(e[5]=t=>a.submit()),class:"form-group form-group-sm"},[be,(0,l.wy)((0,l._)("input",{required:"","onUpdate:modelValue":e[0]||(e[0]=t=>c.product.product_name=t),class:"col-lg-3 form-control form-control-sm",type:"text",placeholder:'Perfume para ropa "Saphirus" lavanda x250ml',id:"nombre"},null,512),[[n.nr,c.product.product_name]]),(0,l._)("span",null,[ve,(0,l.wy)((0,l._)("input",{required:"","onUpdate:modelValue":e[1]||(e[1]=t=>c.product.product_quantity=t),class:"col-lg-3 form-control form-control-sm",type:"text","min-length":"9","max-length":"10",pattern:"[0-9]{1,10}",placeholder:"100",id:"cantidad"},null,512),[[n.nr,c.product.product_quantity]])]),(0,l._)("span",null,[we,(0,l.wy)((0,l._)("input",{"onUpdate:modelValue":e[2]||(e[2]=t=>c.product.product_ppu=t),class:"col-sm-3 form-control form-control-sm",type:"text",placeholder:"350.0",id:"precio"},null,512),[[n.nr,c.product.product_ppu]])]),(0,l._)("span",null,[ge,(0,l.wy)((0,l._)("select",{required:"","onUpdate:modelValue":e[3]||(e[3]=t=>c.product.product_unit=t),class:"last col-sm-3 form-control-3 form-control-sm",id:"select"},[((0,l.wg)(!0),(0,l.iD)(l.HY,null,(0,l.Ko)(c.units,(t=>((0,l.wg)(),(0,l.iD)("option",{value:t},(0,C.zw)(t.unitsName),9,ye)))),256))],512),[[n.bM,c.product.product_unit]])]),ke,Ce,(0,l.Uk)(),(0,l._)("button",{class:"last btn btn-secondary",onClick:e[4]||(e[4]=e=>t.back())},"Volver")],32)])])}var Ue={name:"CreateProducts",data(){return{product:{id_product:null,active:!0,product_name:"",product_ppu:null,product_quantity:null,product_unit:null},units:null,product_unit:null}},methods:{getUnits(){fetch("http://localhost:8080/api/unidades/todos").then((t=>t.json())).then((t=>(this.units=t,console.log(t))))},submit(){fetch("http://localhost:8080/api/productos/nuevo",{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(this.product)})}},created(){this.getUnits()}};const Ve=(0,b.Z)(Ue,[["render",Pe]]);var Ne=Ve,je={components:{CreateProducts:Ne},name:"CreateProductsView"};const xe=(0,b.Z)(je,[["render",me]]);var De=xe;function ze(t,e,o,n,r,c){const a=(0,l.up)("Providers");return(0,l.wg)(),(0,l.j4)(a)}const qe={class:"container-sm col-10 self-align-around"},Ee=(0,l._)("h5",{class:"beginning"},"Proveedores",-1),Oe=(0,l._)("button",{scope:"row",class:"btn btn-secondary container col-2"},"Añadir proveedor",-1),Te={class:"table table-dark table-striped"},Ze=(0,l._)("thead",null,[(0,l._)("tr",{scope:"row"},[(0,l._)("th",{scope:"col"},"Nombre"),(0,l._)("th",{scope:"col"},"Correo"),(0,l._)("th",{scope:"col"},"Teléfono"),(0,l._)("th",{scope:"col"},"Localidad"),(0,l._)("th",{scope:"col"},"Dirección")])],-1),Se={scope:"row"},We={scope:"col"},Le={scope:"col"},Ke={scope:"col"},Me={scope:"col"},He={scope:"col"},Ye=(0,l._)("button",{class:"btn btn-secondary"},"Editar cliente",-1);function $e(t,e,o,n,r,c){const a=(0,l.up)("router-link");return(0,l.wg)(),(0,l.iD)("div",qe,[Ee,(0,l.Wm)(a,{to:"/clients/create"},{default:(0,l.w5)((()=>[Oe])),_:1}),(0,l._)("table",Te,[Ze,(0,l._)("tbody",null,[((0,l.wg)(!0),(0,l.iD)(l.HY,null,(0,l.Ko)(r.providers,(t=>((0,l.wg)(),(0,l.iD)("tr",Se,[(0,l._)("td",We,(0,C.zw)(t.provider_name),1),(0,l._)("td",Le,(0,C.zw)(t.provider_mail),1),(0,l._)("td",Ke,(0,C.zw)(t.provider_phone),1),(0,l._)("td",Me,(0,C.zw)(t.provider_city),1),(0,l._)("td",He,(0,C.zw)(t.provider_address),1),(0,l.Wm)(a,{to:"/clients/edit/"+t.id_provider},{default:(0,l.w5)((()=>[Ye])),_:2},1032,["to"])])))),256))])])])}var Ae={name:"providers",methods:{async getProviders(){fetch("http://localhost:8080/api/proveedores/todos").then((t=>t.json())).then((t=>this.providers=t))}},data(){return{providers:null}},mounted(){this.getProviders()}};const Je=(0,b.Z)(Ae,[["render",$e]]);var Be=Je,Qe={components:{Providers:Be}};const Fe=(0,b.Z)(Qe,[["render",ze]]);var Ge=Fe;const Ie=[{path:"/clients",name:"clients",component:H},{path:"/clients/edit/:id",name:"EditClients",component:dt},{path:"/products",name:"products",component:Jt},{path:"/clients/create",name:"CreateClient",component:jt},{path:"/products/edit/:id",name:"EditProducts",component:pe},{path:"/products/create",name:"CreateProducts",component:De},{path:"/providers",name:"Providers",component:Ge}],Re=(0,y.p7)({history:(0,y.PO)("/"),routes:Ie});var Xe=Re,to=o(636),eo=(o(810),o(417));to.vI.add(eo.BC0,eo.xiG),(0,n.ri)(g).use(Xe).mount("#app")}},e={};function o(n){var l=e[n];if(void 0!==l)return l.exports;var r=e[n]={exports:{}};return t[n](r,r.exports,o),r.exports}o.m=t,function(){var t=[];o.O=function(e,n,l,r){if(!n){var c=1/0;for(d=0;d<t.length;d++){n=t[d][0],l=t[d][1],r=t[d][2];for(var a=!0,s=0;s<n.length;s++)(!1&r||c>=r)&&Object.keys(o.O).every((function(t){return o.O[t](n[s])}))?n.splice(s--,1):(a=!1,r<c&&(c=r));if(a){t.splice(d--,1);var i=l();void 0!==i&&(e=i)}}return e}r=r||0;for(var d=t.length;d>0&&t[d-1][2]>r;d--)t[d]=t[d-1];t[d]=[n,l,r]}}(),function(){o.d=function(t,e){for(var n in e)o.o(e,n)&&!o.o(t,n)&&Object.defineProperty(t,n,{enumerable:!0,get:e[n]})}}(),function(){o.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){o.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)}}(),function(){o.p="/"}(),function(){var t={143:0};o.O.j=function(e){return 0===t[e]};var e=function(e,n){var l,r,c=n[0],a=n[1],s=n[2],i=0;if(c.some((function(e){return 0!==t[e]}))){for(l in a)o.o(a,l)&&(o.m[l]=a[l]);if(s)var d=s(o)}for(e&&e(n);i<c.length;i++)r=c[i],o.o(t,r)&&t[r]&&t[r][0](),t[r]=0;return o.O(d)},n=self["webpackChunkkomodo_front"]=self["webpackChunkkomodo_front"]||[];n.forEach(e.bind(null,0)),n.push=e.bind(null,n.push.bind(n))}();var n=o.O(void 0,[998],(function(){return o(468)}));n=o.O(n)})();
//# sourceMappingURL=app.fb90c5ab.js.map