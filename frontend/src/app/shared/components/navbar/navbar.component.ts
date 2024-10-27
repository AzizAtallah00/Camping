import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { SingupComponent } from '../../../signup/singup.component';
import { SigninComponent } from '../../../signin/signin.component';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {
  constructor(private matDialog: MatDialog) { }

  openDialog() {
    this.matDialog.open(SingupComponent, { width: "60%", height: "70%" });
  }
  openDialogSignIn() {
    this.matDialog.open(SigninComponent, { width: "60%", height: "70%" });
  }
}
