import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { SingupComponent } from 'src/app/singup/singup.component';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent {
  constructor(private matDialog: MatDialog) {}

  openDialog() {
    this.matDialog.open(
      SingupComponent

      // {
      //   panelClass: 'mdc-dialog-surface',
      // }
    );
  }
}
