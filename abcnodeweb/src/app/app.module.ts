import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { BankRoutingModule } from './bank-routing/bank-routing.module';

import { AppComponent } from './app.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { DashboardComponent } from './dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    BankRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
