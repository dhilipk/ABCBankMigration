import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from '../dashboard/dashboard.component';
import { SignInComponent } from '../sign-in/sign-in.component';

const routes: Routes = [
    { path: '', component: DashboardComponent },
    { path: 'signIn', component: SignInComponent },
    { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class BankRoutingModule { }
