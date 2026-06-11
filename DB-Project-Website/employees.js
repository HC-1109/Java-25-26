let employees = [];

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev";
  let response = await fetch(link + "/employees");
  employees = await response.json();
  generateCards(employees);
}

function generateCards(items){
  let html = "";
  for(let i = 0; i < items.length; i++){
    let person = items[i];
    let img = person["Image ID"] || "https://via.placeholder.com/200?text=No+Image";
    let fullName = person.EmployeeFirstName + " " + person.EmployeeLastName;
    html += "<div class='card'>";
    html += "<div class='cardImage'><img src='" + img + "' alt='" + fullName + "'></div>";
    html += "<div class='cardContent'>";
    html += "<h3 class='cardTitle'>" + fullName + "</h3>";
    html += "<p class='cardInfo'><strong>ID:</strong> " + person.EmployeeId + "</p>";
    html += "<p class='cardInfo'><strong>First:</strong> " + person.EmployeeFirstName + "</p>";
    html += "<p class='cardInfo'><strong>Last:</strong> " + person.EmployeeLastName + "</p>";
    html += "</div></div>";
  }
  
  if(items.length === 0) {
    html = "<p style='text-align: center; padding: 20px; width: 100%;'>No employees found</p>";
  }
  
  document.getElementById("mainpanel").innerHTML = html;
}

function filter(){
  let searchTerm = document.getElementById("customername").value.toLowerCase();
  let results = [];
  
  for(let i = 0; i < employees.length; i++){
    let emp = employees[i];
    let fullName = (emp.EmployeeFirstName + " " + emp.EmployeeLastName).toLowerCase();
    if(fullName.includes(searchTerm)) {
      results.push(emp);
    }
  }
  generateCards(results);
}