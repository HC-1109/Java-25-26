let customers, info;

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev"; //replace with your Dev URL
  let route= "/customers";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(customers);
}

function generateCards(customers){  
  let output = document.getElementById("centerpanel");
  let build ="";
  
  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    build += `<div class="card" >`
    build += `<h3> Customer First Name </h3>`;
    build += `<p> ${customer.FirstName}</p>`;
    build += `<div> Customer Last Name</div>`;
    build += `<div2> ${customer.LastName} </div2>`;
    build += `<div> ID </div>`;
    build += `<div2> ${customer.IdImage}</div2>`;
    build += `<hr>`;
    build += `</div>`;
  }
  // Now inject the build content into the output container
  output.innerHTML = build;
}

function filter(){
  let name = document.getElementById("customername").value;

  let newCustomers = [];
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i]
    if( customer.FirstName == name ) {
          newCustomers.push(customer);
       }
  }
  generateCards(newCustomers);  
}