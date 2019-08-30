import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { KarmaSharedModule } from 'app/shared';
import {
  DimensionComponent,
  DimensionDetailComponent,
  DimensionUpdateComponent,
  DimensionDeletePopupComponent,
  DimensionDeleteDialogComponent,
  dimensionRoute,
  dimensionPopupRoute
} from './';

const ENTITY_STATES = [...dimensionRoute, ...dimensionPopupRoute];

@NgModule({
  imports: [KarmaSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    DimensionComponent,
    DimensionDetailComponent,
    DimensionUpdateComponent,
    DimensionDeleteDialogComponent,
    DimensionDeletePopupComponent
  ],
  entryComponents: [DimensionComponent, DimensionUpdateComponent, DimensionDeleteDialogComponent, DimensionDeletePopupComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KarmaDimensionModule {}
