import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { JhiPaginationUtil, JhiResolvePagingParams } from 'ng-jhipster';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Dimension } from 'app/shared/model/Karma/dimension.model';
import { DimensionService } from './dimension.service';
import { DimensionComponent } from './dimension.component';
import { DimensionDetailComponent } from './dimension-detail.component';
import { DimensionUpdateComponent } from './dimension-update.component';
import { DimensionDeletePopupComponent } from './dimension-delete-dialog.component';
import { IDimension } from 'app/shared/model/Karma/dimension.model';

@Injectable({ providedIn: 'root' })
export class DimensionResolve implements Resolve<IDimension> {
  constructor(private service: DimensionService) {}

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Dimension> {
    const id = route.params['id'] ? route.params['id'] : null;
    if (id) {
      return this.service.find(id).pipe(
        filter((response: HttpResponse<Dimension>) => response.ok),
        map((dimension: HttpResponse<Dimension>) => dimension.body)
      );
    }
    return of(new Dimension());
  }
}

export const dimensionRoute: Routes = [
  {
    path: 'dimension',
    component: DimensionComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: ['ROLE_USER'],
      defaultSort: 'id,asc',
      pageTitle: 'Dimensions'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'dimension/:id/view',
    component: DimensionDetailComponent,
    resolve: {
      dimension: DimensionResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'Dimensions'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'dimension/new',
    component: DimensionUpdateComponent,
    resolve: {
      dimension: DimensionResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'Dimensions'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'dimension/:id/edit',
    component: DimensionUpdateComponent,
    resolve: {
      dimension: DimensionResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'Dimensions'
    },
    canActivate: [UserRouteAccessService]
  }
];

export const dimensionPopupRoute: Routes = [
  {
    path: 'dimension/:id/delete',
    component: DimensionDeletePopupComponent,
    resolve: {
      dimension: DimensionResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'Dimensions'
    },
    canActivate: [UserRouteAccessService],
    outlet: 'popup'
  }
];
