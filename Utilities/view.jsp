<%@ include file="/init.jsp" %>


<!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> -->

<style>

.table-title {
       background: #2b395e;
    color: #fff;
    padding: 16px 30px;
    margin: 12px 0px 13px 0px;
  
}


.Assigned {
  
  background-color: blue;
}

.CLOSED {
  background-color: green;
}

.Pending {
  background-color: red;
}

.badge {
font-size:12px;
padding:10px;
}

</style>



<%
	List<FmsTicketCreation> ticketList = (List<FmsTicketCreation>) request.getAttribute("allTickets");

	System.out.println( ":::::jsp::::" + ticketList.size());
%>



 
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap4.min.css">
  


 <div class="table-title rounded">
                <div class="row">
                    <div class="col-sm-12 text-center">
                        <h2><b>All Tickets</b></h2>
                    </div>
                   
                </div>
            </div>
            
<table id="myTable" class="table table-striped table-bordered">
  <thead>
    <tr>
      <th>Ticket ID</th>
      <th>Ticket Title</th>
      <th>Category</th>
      <th>Severity</th>
      <th>Assigned Engineer</th>
      <th>Status</th>
    </tr>
  </thead>
 <tbody>
    <% for (FmsTicketCreation ticket : ticketList) { %>
      <tr>
        <td><%= ticket.getTicketId() %></td>
        <td><%= ticket.getTicketTitle() %></td>
        <td><%= ticket.getCategory() %></td>
        <td><%= ticket.getSeverity() %></td>
        <td><%= ticket.getEngUserName() %></td>
        <td><span class="badge rounded-pill <%= ticket.getStatus() %> text-white"><%= ticket.getStatus() %></span></td>
      </tr>
    <% } %>
  </tbody>
</table>



  <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap4.min.js"></script>
  
<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.7.0/css/buttons.bootstrap4.min.css">
  <script src="https://cdn.datatables.net/buttons/2.3.6/js/dataTables.buttons.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>

  <script src="https://cdn.datatables.net/buttons/1.7.0/js/buttons.html5.min.js"></script>
  





  
  <script>
   
    $(document).ready(function() {
        $('#myTable').DataTable({
          dom: 'Bfrtip',
          buttons: [
              'copyHtml5',
              'excelHtml5',
              'csvHtml5',
              'pdfHtml5'
          ]
        });
      });
  </script>

