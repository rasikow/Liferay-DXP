<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="studentwebmvc.caption"/></b>
</p>

Path:<%=request.getContextPath() %>
<!-- <form name="student-form" id="student-form" >




</form> -->

<!-- This url will check "mvc.command.name=addStudent" property in any action command ( StudentMVCActionCommandName)->
<liferay-portlet:actionURL name="addStudent" var="addStudentURL" />

<!-- This url will go to default process action if you dont mention the action command name -->
<portlet:actionURL var="actionURL" />

<aui:form action="<%= addStudentURL %>" method="post" name="form-student">

	<aui:input name="name" type="text" />
	
	<aui:input name="class" type="text" />
	
	<aui:input name="age" type="text" />
	
	<aui:input name="gender" type="text" />

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
	
</aui:form>


<div class="card-type-asset form-check form-check-card form-check-top-left image-card">
	<div class="card">
		<div class="aspect-ratio card-item-first">
			<div class="custom-control custom-checkbox">
				<label>
					<input class="custom-control-input" type="checkbox"/>
					<span class="custom-control-label"></span>
					<img alt="thumbnail"class="aspect-ratio-item-center-middle aspect-ratio-item-fluid" src="/o/com.zubair.learning.student/images/ur-issue.JPG" />
					<span class="sticker sticker-bottom-left sticker-danger rounded-circle">JPG</span>
				</label>
			</div>
		</div>
		<div class="card-body">
			<div class="card-row">
				<div class="autofit-col autofit-col-expand">
					<div class="card-title text-truncate" title="thumbnail_coffee.jpg">thumbnail_coffee.jpg</div>
					<div class="card-subtitle text-truncate" title="Author Action">Author Action</div>
					<div class="card-detail">
						<span class="label label-success">
							<span class="label-item label-item-expand">Approved</span>
						</span>
					</div>
				</div>
				<div class="autofit-col">
					<div class="dropdown dropdown-action">
						<a aria-expanded="false" aria-haspopup="true" class="component-action dropdown-toggle" data-toggle="dropdown" href="#1" role="button">
							<svg class="lexicon-icon lexicon-icon-ellipsis-v" focusable="false" role="presentation">
								<use href="/images/icons/icons.svg#ellipsis-v" />
							</svg>
						</a>
						<div class="dropdown-menu dropdown-menu-right">
							<a class="dropdown-item" href="#1">Download</a>
							<a class="dropdown-item" href="#1">Edit</a>
							<a class="dropdown-item" href="#1">Move</a>
							<a class="dropdown-item" href="#1">Checkout</a>
							<a class="dropdown-item" href="#1">Permissions</a>
							<a class="dropdown-item" href="#1">Move to Recycle Bin</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>