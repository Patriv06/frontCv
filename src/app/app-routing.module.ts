import { Component, NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { EditarDatosComponent } from './componentes/editar-datos/editar-datos.component';
import { EditarEstudiosComponent } from './componentes/editar-estudios/editar-estudios.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { NavbarEditarComponent } from './componentes/navbar-editar/navbar-editar.component'
import { DatosPersonaComponent } from './componentes/datos-persona/datos-persona.component';
import { DatosEstudiosComponent } from './componentes/datos-estudios/datos-estudios.component';
import { GrillaCComponent } from './componentes/grilla-c/grilla-c.component';
import { DatosTrabajosComponent } from './componentes/datos-trabajos/datos-trabajos.component';
import { EditarTrabajosComponent } from './componentes/editar-trabajos/editar-trabajos.component';
const routes: Routes = [
  {path:'portfolio', component:PortfolioComponent},
  {path:'iniciar-sesion', component:IniciarSesionComponent},
  {path:'editar-datos' , component:EditarDatosComponent},
  {path:'editar-estudios' , component:EditarEstudiosComponent},
  {path:'navbar' , component:NavbarComponent},
  {path:'navbar-editar' , component:NavbarEditarComponent},
  {path:'datos-persona' , component:DatosPersonaComponent},
  {path:'datos-estudios', component:DatosEstudiosComponent},
  {path:'grilla-c' , component:GrillaCComponent},
  {path:'datos-trabajos', component:DatosTrabajosComponent},
  {path:'editar-trabajos', component:EditarTrabajosComponent},
  {path:'', redirectTo:'iniciar-sesion', pathMatch:'full'}
];

@NgModule({
  
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }