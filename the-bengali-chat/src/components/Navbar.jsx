import React from 'react'

export const Navbar = () => {
  return (
    <div className='navbar'>
      <span className="logo">BChat</span>
      <div className="user">
        <img src="https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg?size=626&ext=jpg&ga=GA1.2.1418549224.1687457248&semt=ais" alt="" />
        <span>John</span>
        <button>Logout</button>
      </div>
    </div>
  )
}
export default Navbar
