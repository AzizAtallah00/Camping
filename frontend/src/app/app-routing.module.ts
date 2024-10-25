import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExploreComponent } from './explore/explore.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { SigninComponent } from './signin/signin.component';
import { SingupComponent } from './singup/singup.component';

const routes: Routes = [
  { path: 'explore', component: ExploreComponent },
  { path: 'about', component: AboutUsComponent },
  { path: 'signin', component: SigninComponent },
  { path: 'signup', component: SingupComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
