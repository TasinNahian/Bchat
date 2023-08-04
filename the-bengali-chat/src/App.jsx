import { Register } from './pages/Register'
import "./assets/css/style.scss"
// import { Login } from './pages/Login'
import { Home } from './pages/Home'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import { Login } from './pages/Login'
import { AuthContext } from './context/AuthContext'

function App() {

  // const {currentUser} = useContext(AuthContext);
  // console.log(currentUser)

  return (
    // <Register />
    // <Login/>
    // <Home />
    // 55:53 / 2:05:23

    <BrowserRouter>
      <Routes>
        <Route path='/'>
          <Route index element={<Home />}></Route>
          <Route path='login' element={<Login />} />
          <Route path='register' element={<Register />} />
          <Route path='login' element={<Login />} />

        </Route>
      </Routes>
    </BrowserRouter>

  )
}

export default App
